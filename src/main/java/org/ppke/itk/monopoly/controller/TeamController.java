package org.ppke.itk.monopoly.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.monopoly.domain.Team;
import org.ppke.itk.monopoly.repository.TeamRepository;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_OCTET_STREAM;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_OCTET_STREAM_VALUE;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TeamController {
    private final TeamRepository teamRepository;
    @Operation(summary = "Retrieve list of teams")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of teams retrieved"),
            @ApiResponse(responseCode = "400", description = "Invalid url params supplied")
    })
    @GetMapping(value="/teams", produces = APPLICATION_JSON_VALUE)
    public List<Team> getTeams(@RequestParam(required = false, defaultValue = "100") Integer limit,
                               @RequestParam(required = false, defaultValue = "desc") String sort) {

        if ( !sort.equalsIgnoreCase("desc") && !sort.equalsIgnoreCase("asc") ) {
            throw new IllegalArgumentException("Invalid sorting param!!!");
        }
        var sortParam = sort.equalsIgnoreCase("asc") ?
                Sort.by(Sort.Direction.ASC, "balance") : Sort.by(Sort.Direction.DESC, "balance");

        Page<Team> teams = teamRepository.findAll(PageRequest.of(0, limit, sortParam ));

        return teams.toList();

    }
    @GetMapping(value ="/teams/{id}", produces = APPLICATION_JSON_VALUE)
    public Team getTeamById(@PathVariable("id") Integer id) {

        return teamRepository.findTeamById(id).get();
    }

    @GetMapping(value = "/teams", produces = APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> getTeamsAsTxt() throws IOException {

        byte[] binaryData = FileCopyUtils.copyToByteArray((new ClassPathResource("static/teams.txt"))
                .getInputStream());
        HttpHeaders header = new HttpHeaders();
        header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=teams.txt");

        ByteArrayResource resource = new ByteArrayResource(binaryData);

        return ResponseEntity.ok()
                .headers(header)
                .contentLength(resource.contentLength())
                .contentType(APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}

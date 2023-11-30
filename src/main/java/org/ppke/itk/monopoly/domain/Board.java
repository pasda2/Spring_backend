package org.ppke.itk.monopoly.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "board")
    private List<TableField> tfields;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "board")
    private List<OutsideField> ofields;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "board")
    private List<Position> positions;
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "board")
    private List<Team> teams;
    private String style;
    private Time time;
}

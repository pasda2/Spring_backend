package org.ppke.itk.recipe.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ppke.itk.recipe.domain.User;
import org.ppke.itk.recipe.repository.UserRepository;
/*
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
*/
//@Service
@Slf4j
@RequiredArgsConstructor
public class CostumDetailsService {//implements UserDetailsService {
    /*private final UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findUserByName(username).orElseThrow(() -> new UsernameNotFoundException(String.format("User with name %s")));
        return org.springframework.security.core.userdetails.User.builder()
                .username(username)
                .password(user.getPassword())
                .authorities(user.getRole())
                .build();
    }*/
}

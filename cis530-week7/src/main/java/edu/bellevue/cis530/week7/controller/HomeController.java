package edu.bellevue.cis530.week7.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Authentication authentication) {
        return "Signed in successfully as " + authentication.getName();
    }
}

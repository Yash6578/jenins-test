package com.accenture.jeninstest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {
    @GetMapping("/home")
    ResponseEntity<Object> home() {
        log.info("home method called");
        return ResponseEntity.accepted().body("This is home page");
    }
    
    //@GetMapping("/profile")
    ResponseEntity<Object> home() {
        log.info("profile method called");
        return ResponseEntity.accepted().body("This is home page");
    }

    @GetMapping("/about-us")
    ResponseEntity<Object> aboutUs() {
        log.info("about-us method called");
        return ResponseEntity.accepted().body("This is about-us page");
    }
}

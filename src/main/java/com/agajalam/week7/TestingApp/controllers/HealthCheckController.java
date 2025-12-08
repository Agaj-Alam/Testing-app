package com.agajalam.week7.TestingApp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    ResponseEntity<String> healthCheckController(){
        return ResponseEntity.ok("ok");
    }

}

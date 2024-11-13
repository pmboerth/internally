package com.internally.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {

    private static final String response = "Hello, world!";

    @GetMapping("/healthcheck")
    public String healthcheck() {
        return response;
    }
}


package com.siegfred.dctest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Data
    @RequiredArgsConstructor
    public static class Response {
        private final String message;
    }

    @GetMapping("/greet")
    public Response greet() {
        return new Response("Hello Dev Container JDAR!");
    }
    
    
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StartController {

    @GetMapping("/status")
    public String status() {
        return "Status: API Atualizada com GitHub Actions!";
    }
}   
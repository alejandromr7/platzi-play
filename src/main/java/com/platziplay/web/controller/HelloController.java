package com.platziplay.web.controller;

import com.platziplay.domain.service.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private final String platform;
    private final PlatziPlayAiService platziPlayAiService;

    public HelloController(@Value("${spring.application.name}") String platform, PlatziPlayAiService platziPlayAiService) {
        this.platform = platform;
        this.platziPlayAiService = platziPlayAiService;
    }

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        String hello = this.platziPlayAiService.generatePlatziPlayAi(platform);
        return ResponseEntity.ok(hello);
    }


}

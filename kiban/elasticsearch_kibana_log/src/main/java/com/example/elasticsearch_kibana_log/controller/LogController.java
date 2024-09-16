package com.example.elasticsearch_kibana_log.controller;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/api/test")
    public String logTest(@RequestParam(name = "message", defaultValue = "Test log message") String message) {
        logger.info("Received API request with message: {}", message);
        return "Logged message: " + message;
    }

    @GetMapping("/api/error")
    public String logError(@RequestParam(name = "error", defaultValue = "Test error message") String error) {
        logger.error("Simulated error log: {}", error);
        return "Logged error: " + error;
    }
}

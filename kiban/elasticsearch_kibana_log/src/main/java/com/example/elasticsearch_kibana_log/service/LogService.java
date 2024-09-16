package com.example.elasticsearch_kibana_log.service;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class LogService {
    private static final Logger logger = LoggerFactory.getLogger(LogService.class);

    public void logApiRequest(String message) {
        logger.info("API Request: {}", message);
    }

    public void logApiError(String error) {
        logger.error("API Error: {}", error);
    }
}

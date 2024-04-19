package com.example.ztp_lab2.config;

import com.example.ztp_lab2.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private final TimeService timeService;

    @Autowired
    public AppConfig(@Qualifier("humanReadableFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    @Bean
    public TimeService timeService() {
        return timeService;
    }
}


package com.example.ztp_lab2.service;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component("unixFormat")
public class UnixTimestamp implements TimeService {
    @Override
    public String getCurrentDateTime() {
        return String.valueOf(Instant.now().getEpochSecond());
    }
}

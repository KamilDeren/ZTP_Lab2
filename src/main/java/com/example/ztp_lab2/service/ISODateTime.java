package com.example.ztp_lab2.service;

import org.springframework.stereotype.Component;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component("isoFormat")
public class ISODateTime implements TimeService {
    @Override
    public String getCurrentDateTime() {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return now.format(formatter);
    }
}

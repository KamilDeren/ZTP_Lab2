package com.example.ztp_lab2;

import com.example.ztp_lab2.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZtpLab2Application implements CommandLineRunner {

    @Autowired
    private TimeService timeService;

    public static void main(String[] args) {
        SpringApplication.run(ZtpLab2Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Current Date Time: " + timeService.getCurrentDateTime());
    }
}

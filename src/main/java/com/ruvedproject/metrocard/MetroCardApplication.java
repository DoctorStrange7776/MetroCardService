package com.ruvedproject.metrocard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MetroCardApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MetroCardApplication.class, args);
    }
}

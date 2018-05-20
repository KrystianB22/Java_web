package com.web.first.web_first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.persistence.GeneratedValue;
import java.util.Arrays;

@SpringBootApplication
public class WebFirstApplication {
    Employee employee;
    public static void main(String[] args) {
        SpringApplication.run(WebFirstApplication.class, args);
    }

    }





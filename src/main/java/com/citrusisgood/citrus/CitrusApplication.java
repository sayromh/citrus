package com.citrusisgood.citrus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CitrusApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitrusApplication.class, args);
    }
}

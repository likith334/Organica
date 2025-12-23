package com.organica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
    basePackages = "com.organica",
    excludeFilters = {
        @ComponentScan.Filter(
            type = FilterType.REGEX,
            pattern = "com.organica.config.*"
        )
    }
)
public class OrganicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganicaApplication.class, args);
    }
}

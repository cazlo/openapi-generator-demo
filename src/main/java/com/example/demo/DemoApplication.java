package com.example.demo;

import org.openapi.example.model.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {
    static {
        Pet pet = new Pet()
                .photoUrls(Collections.emptyList());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

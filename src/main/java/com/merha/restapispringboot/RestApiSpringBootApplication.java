package com.merha.restapispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiSpringBootApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "welcome world!!";
    }

}

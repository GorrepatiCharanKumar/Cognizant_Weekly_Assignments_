package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class SpringWebProjecrApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringWebProjecrApplication.class, args);
    }
}

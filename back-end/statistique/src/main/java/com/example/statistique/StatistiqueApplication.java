package com.example.statistique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.statistique.controller", "com.example.statistique.service"})
public class StatistiqueApplication {
    /*

    public static void main(String[] args) {
        SpringApplication.run(StatistiqueApplication.class, args);
    }
*/
}

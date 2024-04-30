package com.example.appareiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.appareiment", "com.example.gestionnaire"})
public class AppareimentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppareimentApplication.class, args);
	}


	// demende de creation du jeu (Api rest)
}

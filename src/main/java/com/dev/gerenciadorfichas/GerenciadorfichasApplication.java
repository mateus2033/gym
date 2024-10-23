package com.dev.gerenciadorfichas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class GerenciadorfichasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorfichasApplication.class, args);
	}
}

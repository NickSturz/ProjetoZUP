package com.socialZuppers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.usuarios.repository")
@SpringBootApplication
public class SocialZuppersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialZuppersApplication.class, args);
	}

}

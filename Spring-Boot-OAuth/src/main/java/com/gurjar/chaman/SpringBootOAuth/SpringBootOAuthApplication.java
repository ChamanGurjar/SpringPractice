package com.gurjar.chaman.SpringBootOAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringBootOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuthApplication.class, args);
	}

}

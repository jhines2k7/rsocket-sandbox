package com.hines.james;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RsocketSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsocketSandboxApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Hello World!");
		};
	}
}

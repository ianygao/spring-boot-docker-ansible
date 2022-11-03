package com.yanggao.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDockerAnsibleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerAnsibleApplication.class, args);
	}

	@RestController
	static class BootController {
		@GetMapping("/{name}")
		public ResponseEntity<String> greeting(@PathVariable(value = "name") String name) {
			return ResponseEntity.ok("Hi " + name + ", how are you?");
		}
	}

}

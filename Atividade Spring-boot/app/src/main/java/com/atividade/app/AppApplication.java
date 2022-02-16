package com.atividade.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	@GetMapping("/end-point1")
	public String atividade1() {
		return "HELLO WORLD -- Habilidades e mentalidades: Orientação ao detalhe e persistência.";
	}

	@GetMapping("/end-point2")
	public String atividade2() {
		return "HELLO WORLD -- Objetivos de aprendizagem: Aprofundar os estudos em Spring.";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}

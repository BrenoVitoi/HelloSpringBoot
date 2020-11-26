package br.com.treinaweb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan()
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//Dar um Run AS em Maven Build.. em Goals colocar spring-boot:run
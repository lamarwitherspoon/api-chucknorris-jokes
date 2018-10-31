package io.lamar.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ChucknorrisjokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisjokesApplication.class, args);
	}


}

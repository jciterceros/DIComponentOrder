package com.jciterceros.DIComponentOrder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiComponentOrderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DiComponentOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from CommandLineRunner");
	}
}

package com.toyproject.healpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealpetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealpetApplication.class, args);
		String test = "Hello world!!";
		System.out.println(test + "2");
		System.out.println(test + "3");

		String test2 = "Hello Java!";
		System.out.println(test2);

	}

}

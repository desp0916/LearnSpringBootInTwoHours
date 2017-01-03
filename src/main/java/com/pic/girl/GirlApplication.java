package com.pic.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {

	@Autowired
	private GirlProperties girlProperties;

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
}

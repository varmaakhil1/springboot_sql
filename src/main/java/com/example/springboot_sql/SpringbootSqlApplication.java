package com.example.springboot_sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class SpringbootSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSqlApplication.class, args);
	}


	@GetMapping("testapp")
	public String getrandomnumber(){
	Random random = new Random();
	return random.nextBoolean() ? "1":"2";
	}

}

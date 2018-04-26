package com.bgy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bgy.dao")
public class SapWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapWebApplication.class, args);
	}
}

package com.spring.codeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.codeblog.utils.DummyDate;

@SpringBootApplication
public class CodeblogApplication {

	public static void main(String[] args) {
		System.out.println("teste");
		SpringApplication.run(CodeblogApplication.class, args);
	}

}

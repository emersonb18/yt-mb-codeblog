package com.spring.codeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.codeblog.utils.DummyDate;

@SpringBootApplication
public class CodeblogApplication {

	public static void main(String[] args) {
		System.out.println("branch02");
		System.out.println("branch 01");
		SpringApplication.run(CodeblogApplication.class, args);
	}

}

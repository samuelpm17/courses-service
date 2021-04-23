package com.unosquare.learning.coursesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.unosquare.learning.commons.learningcommons.model.entity"})
@SpringBootApplication
public class CoursesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesServiceApplication.class, args);
	}

}

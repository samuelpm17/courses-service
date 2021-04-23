package com.unosquare.learning.coursesservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unosquare.learning.commons.learningcommons.model.entity.Course;
import com.unosquare.learning.coursesservice.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	private CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping("/list")
	public List<Course> listAll(){
		return courseService.findAll();
	}

	@GetMapping("/list/{id}")
	public Course findById(@PathVariable Long id){
		return courseService.findById(id);
	}

	@PostMapping("/create")
	public Course create(Course course) {
		return courseService.create(course);
	}

}

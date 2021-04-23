package com.unosquare.learning.coursesservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unosquare.learning.commons.learningcommons.model.entity.Course;
import com.unosquare.learning.coursesservice.repository.CourseRepository;

public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepository;
	
	@Autowired
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> findAll() {
		return (List<Course>) courseRepository.findAll();
	}

	@Override
	public Course findById(Long id) {
		return courseRepository.findById(id).orElse(null);
	}

	@Override
	public Course create(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void delete(Long Id) {
		courseRepository.deleteById(Id);
	}

}

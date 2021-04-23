package com.unosquare.learning.coursesservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unosquare.learning.commons.learningcommons.model.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}

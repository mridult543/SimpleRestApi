package com.springrest.simplerestapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.simplerestapi.entities.Course;

@Service
public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}

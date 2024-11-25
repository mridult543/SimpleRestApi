package com.springrest.simplerestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.simplerestapi.entities.Course;
import com.springrest.simplerestapi.services.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/")
	public String home() {
		return "Welcome to simplerestapi";
	}
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return courseService.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
}

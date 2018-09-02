package com.lalitstuff.springbootapi1.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> topics = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId)
		.forEach(topics::add);
		return topics;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}

package com.pawan.service;

import com.pawan.entity.Course;
import com.pawan.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        Course existing = courseRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(course.getTitle());
            existing.setDescription(course.getDescription());
            existing.setPrice(course.getPrice());
            return courseRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
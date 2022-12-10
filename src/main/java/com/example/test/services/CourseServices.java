package com.example.test.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.Course;
import com.example.test.repository.CourseRepository;
@Service
public class CourseServices {
    @Autowired
    private CourseRepository courseRepository;

    public void addNewCourse(Course course) {
        courseRepository.save(course);

    }
    public Course getCourse(long id) {
        return courseRepository.getCourse(id);

    }
    public List<Course> getAllCourse() {
        List<Course>allCourses=new ArrayList<>();
        for (Course iterable_element : courseRepository.findAll()) {
            allCourses.add(iterable_element);
        }
        return allCourses;
    }
    public void deleteCourse(long id) {

        courseRepository.deleteById(id);
    }
    public Course updateCourse(long id,Course _course) {
        Course course=new Course();
        course=courseRepository.getCourse(id);
        course.setName(_course.getName());
        course.setCategory(_course.getCategory());
        course.setDescription(_course.getDescription());
        course.setRating(_course.getRating());
        return courseRepository.save(course);
    }


}

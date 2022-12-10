package com.example.test.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.model.Course;
import com.example.test.services.CourseServices;

@Controller
@RequestMapping(path="/test")
public class CourseController {
    @Autowired
    private CourseServices courseServices;
    @PostMapping(path="/add")
    public void addNewCourse(@RequestBody Course course)
    {
        courseServices.addNewCourse(course);
    }
    @GetMapping(path="/get/{id}" )
    public @ResponseBody Course getCourse(@PathVariable("id")long id)
    {
        return courseServices.getCourse(id);
    }
    @GetMapping(path="/getAll")
    public @ResponseBody List<Course> getAllCourse()
    {
        return courseServices.getAllCourse();
    }
    @DeleteMapping(path="/delete/{id}")
    public void deleteCourse(@PathVariable("id")long id)
    {
        courseServices.deleteCourse(id);
    }
    @PutMapping(path="/update/{id}")
    public @ResponseBody Course updateCourse(@PathVariable("id")long id,@RequestBody Course course)
    {
        return courseServices.updateCourse(id,course);
    }

}

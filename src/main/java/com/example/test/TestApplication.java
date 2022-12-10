package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.test.model.Course;
import com.example.test.repository.CourseRepository;

@SpringBootApplication
public class TestApplication {
    private static final Logger log = LoggerFactory.getLogger(TestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Course("Elettronica", "INF",8,"electronics"));
            repository.save(new Course("reti", "INF",8,"Computer Networks"));

            // fetch all customers
            log.info("Course found with findAll():");
            log.info("-------------------------------");
            for (Course course : repository.findAll()) {
                log.info(course.toString());
            }
            log.info("");

        };
    }
}

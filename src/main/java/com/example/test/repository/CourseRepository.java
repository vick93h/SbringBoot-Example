package com.example.test.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.test.model.*;
@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
    @Query(value="SELECT * FROM COURSE WHERE ID=:id",nativeQuery = true)
    Course getCourse(@Param("id")long id);


}

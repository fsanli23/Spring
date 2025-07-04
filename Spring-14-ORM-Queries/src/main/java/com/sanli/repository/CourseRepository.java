package com.sanli.repository;

import com.sanli.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Courses,Long> {
    //find all courses by category
    List<Courses>findByCategory(String category);

    // find all courses by category  and order the entities by name
    List<Courses>findByCategoryOrderByName(String category);





}

package com.sanli.repository;

import com.sanli.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    //display all department in the furniture department

    List<Department> findByDepartment(String department);


    // display all departemnts in the  health divison

    List<Department> findByDivisionIs(String division);

    //display top 3 departments with division includes "Hea", without duplicates

    List<Department> findDistinctTop3ByDivisionContains(String pattern);





}

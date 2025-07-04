package com.sanli.bootstrap;

import com.sanli.entity.Courses;
import com.sanli.repository.CourseRepository;
import com.sanli.repository.DepartmentRepository;
import com.sanli.repository.EmployeeRepository;
import com.sanli.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataGenerator implements CommandLineRunner {
    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
   private final CourseRepository courseRepository;
    public DataGenerator(CourseRepository courseRepository,RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository= courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----------------Region start-------------------------");
        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada").toString());
        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));
        System.out.println("regionRepository.findByCountryContainingOrderBy(\"United\") = " + regionRepository.findByCountryContainingOrderByCountry("United"));
        System.out.println("regionRepository.findTopByCountry(\"Canada\") = " + regionRepository.findTop2ByCountry("Canada"));
        System.out.println("-----------------Region end-------------------------");

        System.out.println("-----------------Department start-------------------------");
        System.out.println("departmentRepository.findByDepartment(\"furniture\") = " + departmentRepository.findByDepartment("Toys"));
        System.out.println("departmentRepository.findByDivisionIs(\"health\") = " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("departmentRepository.findDistinctTop3ByDivisionContains(\"Hea\") = " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));
        System.out.println("-----------------Department end-------------------------");

        System.out.println("-----------------Employee start-------------------------");

//        System.out.println(employeeRepository.findByFirstNameIsNot("Berrie"));
//        System.out.println(employeeRepository.countByFirstNameIsNot("Berrie"));
//        System.out.println(employeeRepository.findByLastNameStartingWith("dubbe"));
////        System.out.println(employeeRepository.findByLastNameStartingWithAndDepartment("Games",  new Department()));
//        System.out.println(employeeRepository.findBySalaryGreaterThanEqualOrderBySalaryDesc(1200L));
        System.out.println(employeeRepository.findDistinctTop3BySalaryLessThan(1000));
        System.out.println(" = " + employeeRepository.findByEmailIsNull());
        System.out.println(employeeRepository.getEmployee());
        System.out.println("-----------------Employee end-------------------------");
        System.out.println("-----------------Courses Start-------------------------");
        System.out.println("courseRepository.findByCategory(\"\") = " + courseRepository.findByCategory("spring"));

        System.out.println("courseRepository.findByCategoryOrderByName() = " + courseRepository.findByCategoryOrderByName(""));



        System.out.println("-----------------Courses End-------------------------");


    }
}

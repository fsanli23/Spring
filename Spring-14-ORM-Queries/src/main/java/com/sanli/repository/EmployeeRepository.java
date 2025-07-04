package com.sanli.repository;

import com.sanli.entity.Department;
import com.sanli.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //display all the employees with email adress

    List<Employee> findByEmail(String email);
    // display all emails with firstname '' and last name ' ' also show all the employees with email address

    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);


    //All employees in a specific department
//    List<Employee> findByDepartment_DepartmentId(String department);

    //    Employees with a salary greater than X
    List<Employee> findBySalaryGreaterThan(Long salary);

    //    Employees hired after a specific year
    List<Employee> findByHireDateAfter(LocalDate hireDate);

    //    Employees whose email contains a certain word
    List<Employee> findByEmailContaining(String pattern);

    //    Employees with a first name starting with a letter
    List<Employee> findByFirstNameStartingWith(String character);

    //    Top 2 highest-paid employees
    List<Employee> findTop2ByOrderBySalaryDesc();

    //       Employees hired between two dates


    //    All employees with gender "F"
    List<Employee> findByGender(String g);

    //    Employees in a certain region and department
 //   List<Employee> findByRegionAndDepartment(String region, String department);




    //Find employees whose last name ends with "son"
    List<Employee> findByLastNameEndingWith(String suffix);



//Find employees whose email contains "gmail" and have a salary over 80,000

    List<Employee> findByEmailContainingAndSalaryGreaterThan(String pattern, Long salary);


    // display all employees that firstname is not '';

    List<Employee> findByFirstNameIsNot(String name);

    int countByFirstNameIsNot(String name);

    //display all employee where lastname starts with

    List<Employee> findByLastNameStartingWith(String suffix);

    //All employees whose department is "Sports" and whose last name starts with "Dubee".

    List<Employee> findByLastNameStartingWithAndDepartment(String lastName, Department department);

    List<Employee> findBySalaryLessThanEqual(Long salary);

    // display all employees that has been hired between " and '' dates?

    List<Employee> findByHireDateBetween(LocalDate date1, LocalDate date2);

    //display all employees where salary greater and equal to '' in order

    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Long salary);



   // Display top unique 3 employees that is making less than ''

    List<Employee>findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email

  Optional<List<Employee>>findByEmailIsNull();


     //  select e ----> Employee e = new Employee()  ,  this is object oriented. e stands for a new instance. we need a no Args constructor always for this purpose.
    @Query("select  e.salary from Employee e where e.email='amcnee1@google.es'"  )
    Integer getEmployee();





}

package com.sanli.bootstrap;

import com.sanli.entity.Department;
import com.sanli.entity.Employees;
import com.sanli.entity.Region;
import com.sanli.enums.Gender;
import com.sanli.repository.DeparmentRepository;
import com.sanli.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;


    public DataGenerator(EmployeeRepository employeeRepository, DeparmentRepository deparmentRepository) {
        this.employeeRepository = employeeRepository;

    }


    @Override
    public void run(String... args) throws Exception {


        Employees e1 = new Employees("Berrie", "sanli", "berrrikesanli@gmail.com", LocalDate.of(2022, 11, 11), Gender.MALE, 5000);
        Employees e2 = new Employees("Olivia", "Davis", "olivia.davis56@company.com", LocalDate.of(2023, 7, 23), Gender.FEMALE, 72000);
        Employees e3 = new Employees("Noah", "Johnson", "noah.johnson81@company.com", LocalDate.of(2021, 3, 15), Gender.MALE, 61000);
        Employees e4 = new Employees("Charlotte", "Miller", "charlotte.miller09@company.com", LocalDate.of(2024, 1, 5), Gender.FEMALE, 48000);
        Employees e5 = new Employees("Elijah", "Brown", "elijah.brown77@company.com", LocalDate.of(2020, 9, 29), Gender.MALE, 95000);
        Employees e6 = new Employees("Amelia", "Jones", "amelia.jones34@company.com", LocalDate.of(2022, 5, 18), Gender.FEMALE, 55000);
        Employees e7 = new Employees("James", "Wilson", "james.wilson22@company.com", LocalDate.of(2023, 2, 1), Gender.MALE, 80000);
        Employees e8 = new Employees("Sophia", "Taylor", "sophia.taylor45@company.com", LocalDate.of(2021, 10, 10), Gender.FEMALE, 68000);
        Employees e9 = new Employees("Lucas", "Moore", "lucas.moore63@company.com", LocalDate.of(2024, 4, 20), Gender.MALE, 42000);
        Employees e10 = new Employees("Isabella", "Jackson", "isabella.jackson99@company.com", LocalDate.of(2020, 12, 7), Gender.FEMALE, 88000);
        Employees e11 = new Employees("Mason", "White", "mason.white12@company.com", LocalDate.of(2022, 8, 2), Gender.MALE, 75000);

        Department d1 = new Department("sports", "outdoors");
        Department d2 = new Department("Electronics", "Consumer");
        Department d3 = new Department("Apparel", "Fashion");
        Department d4 = new Department("Books", "Education");
        Department d5 = new Department("Groceries", "Food & Beverage");
        Department d6 = new Department("Automotive", "Vehicles");

        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);
        e6.setDepartment(d6);

        Region region1 = new Region("United States", "Pacific Northwest");
        Region region2 = new Region("Germany", "Bavaria");
        Region region3 = new Region("Japan", "Kansai");
        Region region4 = new Region("Brazil", "Southeast");
        Region region5 = new Region("Australia", "New South Wales");

        e1.setRegion(region1);
        e2.setRegion(region2);
        e3.setRegion(region3);
        e4.setRegion(region4);
        e5.setRegion(region5);

        e1.setRegion(new Region("Turkey","Mid East"));




        var employeesList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11));
        var departmentList = new ArrayList<>(Arrays.asList(d1, d2, d3, d4, d5, d6));

        employeeRepository.saveAll(employeesList);
      //  deparmentRepository.saveAll(departmentList);


    }
}

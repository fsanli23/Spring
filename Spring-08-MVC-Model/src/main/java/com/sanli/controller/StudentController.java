package com.sanli.controller;

import com.sanli.model.SchoolStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "123");
        model.addAttribute("Course", null);

        return "student/welcome";
    }

    @RequestMapping("/test")
    public String test01() {

        return "student/welcome";
    }

    @RequestMapping("/id")
    public String studentId(Model model) {
        SchoolStudent student = new SchoolStudent("fatih", 40, "sanli");

        UUID id = UUID.randomUUID();
        String[] firstNames = {"John", "Jane", "Alex", "Emily", "Sam"};
        String firstName = firstNames[new Random().nextInt(firstNames.length)];
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        model.addAttribute("studentId", id.toString());
        model.addAttribute("firstName", firstName);
        model.addAttribute("numbers", numbers);
        // Add the student object to the model. Ensure that the view uses method-style syntax (e.g., student.name()) for records.
        model.addAttribute("student", student);

        return "student/id";
    }


}

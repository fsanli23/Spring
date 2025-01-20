package com.sanli.controller;

import com.sanli.model.Employee;
import com.sanli.model.MentorClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping( "/mentor")
    public String mentorPage(Model model) {
        MentorClass mentor01 = new MentorClass("fatih", "sanli", 40, MentorClass.Gender.MALE);
        MentorClass mentor02 = new MentorClass("Mike", "Den", 25, MentorClass.Gender.MALE);
        MentorClass mentor03 = new MentorClass("John", "Riev", 36, MentorClass.Gender.MALE);
        MentorClass mentor04 = new MentorClass("Tom", "Swsyen", 47, MentorClass.Gender.MALE);
        Employee  employee = new Employee("dan",1423);




         model.addAttribute("mentor01", mentor01);
         model.addAttribute("mentor02", mentor02);
         model.addAttribute("mentor03", mentor03);
         model.addAttribute("mentor04", mentor04);
          model.addAttribute("employee", employee);

        return "mentor/mentor";
    }


}

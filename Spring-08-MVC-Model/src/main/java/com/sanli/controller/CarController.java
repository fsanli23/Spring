package com.sanli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {


    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, @RequestParam String year, Model model) { // localhost:8080/car/info?make=honda
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);

        return "car/car-info";
    }
// test gui
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(required = false,defaultValue = "honda") String make, @RequestParam String year, Model model) { // localhost:8080/car/info?make=honda
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        System.out.println(make);

        return "car/car-info";
    }


    @RequestMapping("/info/{make}")  // localhost:8080/car/info/honda
    public String carinfo(@PathVariable String make,Model model){
        model.addAttribute("make",make);
         return "car/car-info";
    }
}

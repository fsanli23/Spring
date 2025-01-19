package com.sanli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// annotate the class the @Controller stereotype annotation
public class HomeController {


    @RequestMapping("/home")// use @RequestMapping annotation to associate hte action with http request path
    public String home() {
        return "home.html"; // return the html document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }

    @RequestMapping("user/home")
    public String example() {
        return "userInfo.html";
    }
    @RequestMapping
    public String example01() {
        return "welcome.html";
    }


}

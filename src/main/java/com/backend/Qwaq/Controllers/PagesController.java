package com.backend.Qwaq.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/user page")
    public String user_page(){
        return "user page";
    }

    @GetMapping("/math_test")
    public String math_test(){
        return "math_test";
    }

}

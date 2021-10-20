package com.example.myWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerM {
    @GetMapping(" ")
    public String showHomePage(){
        System.out.println("main controller");
        return "index";

    }

}

package com.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/show-form")
    public String showForm(){
        return "hello-world-form";
    }
    @RequestMapping("/form-processing")
    public String formProcessing(){
        return "hello-world-page";
    }
}

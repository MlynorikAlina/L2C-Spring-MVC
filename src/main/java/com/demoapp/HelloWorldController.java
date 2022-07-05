package com.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String showMenu(){
        return "menu";
    }
    @RequestMapping("/show-form")
    public String showForm(){
        return "hello-world-form";
    }
    @RequestMapping("/form-processing")
    public String formProcessing(){
        return "hello-world-page";
    }
}

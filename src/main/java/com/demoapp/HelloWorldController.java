package com.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String showMenu(){
        return "menu";
    }
    @RequestMapping("/show-form")
    public String showForm(Model model){
        model.addAttribute("formProcessing", "form-processing");
        return "hello-world-form";
    }
    @RequestMapping("/make-uppercase")
    public String showFormUppercase(Model model){
        model.addAttribute("formProcessing", "form-processing-uppercase");
        return "hello-world-form";
    }
    @RequestMapping("/form-processing")
    public String formProcessing(HttpServletRequest request, Model model){
        model.addAttribute("name", request.getParameter("studentName"));
        return "hello-world-page";
    }
    @RequestMapping("/form-processing-uppercase")
    public String formProcessingUppercase(HttpServletRequest request, Model model){
        model.addAttribute("name", request.getParameter("studentName").toUpperCase());
        return "hello-world-page";
    }
}

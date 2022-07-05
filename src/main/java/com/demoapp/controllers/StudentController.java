package com.demoapp.controllers;

import com.demoapp.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("/form-processing")
    public String formProcessing(@ModelAttribute("student") Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "student-confirmation-page";
    }
}

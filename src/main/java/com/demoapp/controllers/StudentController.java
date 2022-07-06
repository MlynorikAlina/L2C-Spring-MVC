package com.demoapp.controllers;

import com.demoapp.models.Student;
import com.demoapp.models.StudentOptionsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final StudentOptionsData optionsData;
    @Autowired
    public StudentController(StudentOptionsData optionsData) {
        this.optionsData = optionsData;
    }

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("countryOptions", optionsData.getCountryOptions());
        model.addAttribute("programingLanguage", optionsData.getProgramingLanguage());
        model.addAttribute("operationSystem", optionsData.getOperatingSystem());
        return "student-form";
    }

    @RequestMapping("/form-processing")
    public String formProcessing(@ModelAttribute("student") Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName());
        return "student-confirmation-page";
    }
}

package com.demoapp.controllers;

import com.demoapp.models.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.net.BindException;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/customer-form";
    }

    @RequestMapping("/form-processing")
    public String formProcessing(@Valid @ModelAttribute("customer") Customer customer,
                                 BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer/customer-form";
        } else {
            return "customer/customer-confirmation-page";
        }
    }
}

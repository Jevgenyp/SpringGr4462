package com.seminar4Homework.Sem4Home.controllers;

import com.seminar4Homework.Sem4Home.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute UserForm userForm, Model model) {
        model.addAttribute("name", userForm.getName());
        model.addAttribute("surname", userForm.getSurname());
        return "submit";
    }

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Привет, мир!");
        return "greeting";
    }
    @GetMapping("/form")
    public String formPage() {
        return "form";
    }

}

package com.demo.demoapp.controller;

import com.demo.demoapp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "Engineer"),
                new Employee(2, "Alice", "Analyst")
        );

        model.addAttribute("employees", employees);
        return "home";
    }
}
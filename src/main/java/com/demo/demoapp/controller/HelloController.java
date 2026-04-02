package com.demo.demoapp.controller;

import com.demo.demoapp.model.Employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, your Spring boot application is running!!";
    }

    @GetMapping("/test")
    public String test(){
        return "working!!";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return Arrays.asList(
            new Employee(1, "John", "Engineer"),
            new Employee(2, "Alice", "Analyst")
        );
    }
}

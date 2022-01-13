package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @GetMapping("/hello")
    public String sayHello(){

        return "Hello world";
    }
    @PostMapping("hi")
    public String sayHi(){
        return "Hi Swaggeer2";
    }
}

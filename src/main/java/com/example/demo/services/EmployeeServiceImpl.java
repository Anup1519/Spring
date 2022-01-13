package com.example.demo.services;


import com.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository repo;

}

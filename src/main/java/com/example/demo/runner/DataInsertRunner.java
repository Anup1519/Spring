package com.example.demo.runner;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInsertRunner implements CommandLineRunner{

    @Autowired
    private EmployeeRepository repo;
    @Override
    public void run(String... args) throws Exception {
        repo.save(new Employee(10,"puru","Delhi",9938477492.0));
        repo.save(new Employee(11,"virus","noida",6348477492.0));
        repo.save(new Employee(12,"kher","New Delhi",9858477492.0));
        repo.save(new Employee(13,"yogi","gurugram",3458477492.0));
        repo.save(new Employee(14,"yadav","Delhi",4988477492.0));
        repo.save(new Employee(15,"Arman","Delhi",9098477492.0));



    }
}

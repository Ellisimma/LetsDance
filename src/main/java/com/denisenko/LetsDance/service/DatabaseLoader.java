package com.denisenko.LetsDance.service;

import com.denisenko.LetsDance.model.Employee;
import com.denisenko.LetsDance.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private final EmployeeRepository repository;

    @Override
    public void run(String... strings) {
        this.repository.save(new Employee("Joe Biden", 45, 5));
        this.repository.save(new Employee("President Obama", 54, 8));
        this.repository.save(new Employee("Crystal Mac", 34, 12));
        this.repository.save(new Employee("James Henry", 33, 2));
    }
}

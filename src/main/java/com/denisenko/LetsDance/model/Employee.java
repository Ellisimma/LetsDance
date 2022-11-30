package com.denisenko.LetsDance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private int years;

    public Employee(String name, int age, int years) {
        this.name = name;
        this.age = age;
        this.years = years;
    }
}

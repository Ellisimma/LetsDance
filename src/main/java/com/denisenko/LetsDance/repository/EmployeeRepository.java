package com.denisenko.LetsDance.repository;

import com.denisenko.LetsDance.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}

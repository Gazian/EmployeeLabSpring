package com.codeclan.example.employeetracker.repositories;


import com.codeclan.example.employeetracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}

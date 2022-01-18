package com.codeclan.example.employeetracker.repositories;


import com.codeclan.example.employeetracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

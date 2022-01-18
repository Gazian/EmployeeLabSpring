package com.codeclan.example.employeetracker.repositories;

import com.codeclan.example.employeetracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

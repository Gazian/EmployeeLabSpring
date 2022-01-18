package com.codeclan.example.employeetracker;

import com.codeclan.example.employeetracker.models.Department;
import com.codeclan.example.employeetracker.models.Employee;
import com.codeclan.example.employeetracker.models.Project;
import com.codeclan.example.employeetracker.repositories.DepartmentRepository;
import com.codeclan.example.employeetracker.repositories.EmployeeRepository;
import com.codeclan.example.employeetracker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackerApplicationTests {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void hasEmployeeandDepartment(){
		Department department = new Department("E53");
		departmentRepository.save(department);
		Employee employee = new Employee("JP", "Gazian", "A254", department);
		employeeRepository.save(employee);
	}

	@Test
	public void departmentHasManyEmployees(){
		Department department = new Department("E53");
		departmentRepository.save(department);
		Employee employee1 = new Employee("JP", "Gazian", "A254", department);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Olly", "Marsters", "75BC8", department);
		employeeRepository.save(employee2);
	}

	@Test
	public void employeesHaveProjects(){
		Department department = new Department("Winter wonder clan");
		departmentRepository.save(department);
		Employee employee1 = new Employee("JP", "Gazian", "A254", department);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Olly", "Marsters", "75BC8", department);
		employeeRepository.save(employee2);
		Project project1 = new Project("BBC Sleigh Ride");
		project1.addEmployee(employee1);
		project1.addEmployee(employee2);
		projectRepository.save(project1);
		Project project2 = new Project("EmployeeTracker");
		project2.addEmployee(employee1);
		project2.addEmployee(employee2);
		projectRepository.save(project2);
	}

}

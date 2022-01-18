package com.codeclan.example.employeetracker.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;
        
        @OneToMany(mappedBy = "department")
        private List<Employee> employees;

        public Department(String name){
                this.name = name;
                this.employees = new ArrayList<>();
        }
        
        public Department(){
        }

//        Id getters and setters

        public Long getId(){
                return id;
        }
        
        public void setId(Long id){
                this.id = id;
        }

//        Rest of getters and setters

        public String getName(){
                return this.name;
        }

        public void setName(){
                this.name = name;
        }
}

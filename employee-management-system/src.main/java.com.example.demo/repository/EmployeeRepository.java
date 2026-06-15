package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

// This interface connects Java with Database
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

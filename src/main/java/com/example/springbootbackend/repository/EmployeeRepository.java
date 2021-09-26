package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

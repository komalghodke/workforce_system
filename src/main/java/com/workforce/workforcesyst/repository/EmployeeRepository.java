package com.workforce.workforcesyst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workforce.workforcesyst.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

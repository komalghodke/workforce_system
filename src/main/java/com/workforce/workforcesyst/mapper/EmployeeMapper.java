package com.workforce.workforcesyst.mapper;

import com.workforce.workforcesyst.dto.EmployeeDto;
import com.workforce.workforcesyst.entity.Employee;

public class EmployeeMapper {
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmailId()
				);
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmailId()
				);
	}
}

package com.workforce.workforcesyst.service.impl;

import org.springframework.stereotype.Service;

import com.workforce.workforcesyst.dto.EmployeeDto;
import com.workforce.workforcesyst.entity.Employee;
import com.workforce.workforcesyst.mapper.EmployeeMapper;
import com.workforce.workforcesyst.repository.EmployeeRepository;
import com.workforce.workforcesyst.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}

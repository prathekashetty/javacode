package com.wolken.bank.service;

import java.util.List;

import com.wolken.bank.dto.EmployeeDTO;

public interface EmployeeService {

	List<EmployeeDTO> validateAndGetAll();

	String validateAndSave(EmployeeDTO dto);

	EmployeeDTO validateAndFindByName(String name);

	EmployeeDTO validateAndFindByDesignation(String designation);

	EmployeeDTO validateAndFindAll();

	EmployeeDTO validateAndFindBySalary(float salary);
}

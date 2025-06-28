package com.example.ems_backend.service;

import java.util.List;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long employeeId, Employee updatedEmployee);

    void deleteEmployee(Long employeeId);
}

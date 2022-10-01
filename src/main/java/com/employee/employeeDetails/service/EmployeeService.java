package com.employee.employeeDetails.service;

import com.employee.employeeDetails.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);
}

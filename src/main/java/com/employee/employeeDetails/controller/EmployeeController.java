package com.employee.employeeDetails.controller;

import com.employee.employeeDetails.model.Employee;
import com.employee.employeeDetails.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}

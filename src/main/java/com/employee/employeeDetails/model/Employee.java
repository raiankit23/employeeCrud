package com.employee.employeeDetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;
}

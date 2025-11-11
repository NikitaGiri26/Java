package com.demo.services;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeServices {

    Set<Employee> displayAll();

    void addNewEmployee();

}

package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

    Set<Employee> displayAll();

    void add(Employee e);

}

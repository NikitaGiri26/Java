package com.demo.test;

import java.util.Set;

import com.demo.beans.Employee;
import com.demo.services.EmployeeServices;
import com.demo.services.EmployeeServicesImpl;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeServices eser = new EmployeeServicesImpl();

        Set<Employee> e = eser.displayAll();

        for (Employee employee : e) {
            System.out.println(employee);
        }

        eser.addNewEmployee();

        for (Employee employee : e) {
            System.out.println(employee);
        }
    }
}

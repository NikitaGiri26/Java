package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServicesImpl implements EmployeeServices {
    EmployeeDao edao = new EmployeeDaoImpl();

    @Override
    public Set<Employee> displayAll() {
        return edao.displayAll();
    }

    @Override
    public void addNewEmployee() {
        // int empid, String ename, LocalDate jdate, String role
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee id : ");
        int id = sc.nextInt();
        System.out.print("Employee name : ");
        String name = sc.next();
        System.out.print("Employee jdate (dd/mm/yyyy): ");
        String date = sc.next();

        LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Employee e = new Employee(id, name, ldt);

        edao.add(e);

    }
}

package com.demo.dao;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    static Set<Employee> eset;

    static {
        eset = new TreeSet<>();
        // int empid, String ename, LocalDate jdate, String role
        eset.add(new Employee(2, "abc", LocalDate.of(2025, 8, 10)));
        eset.add(new Employee(1, "abc", LocalDate.of(2025, 8, 10), "HR"));
    }

    @Override
    public Set<Employee> displayAll() {
        return eset;
    }

    @Override
    public void add(Employee e) {
        eset.add(e);
    }
}

package com.demo.beans;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String ename;
    private LocalDate jdate;
    private String role;

    public Employee() {
    }

    public Employee(int empid, String ename, LocalDate jdate, String role) {
        this.empid = empid;
        this.ename = ename;
        this.jdate = jdate;
        this.role = role;
    }

    public Employee(int empid, String ename, LocalDate jdate) {
        this.empid = empid;
        this.ename = ename;
        this.jdate = jdate;
        this.role = "Trainee";
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public LocalDate getJdate() {
        return jdate;
    }

    public void setJdate(LocalDate jdate) {
        this.jdate = jdate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", ename=" + ename + ", jdate=" + jdate + ", role=" + role + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empid, o.empid); 
    }

}

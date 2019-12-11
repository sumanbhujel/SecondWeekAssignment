package com.example.secondweekassignment.model;

public class Employee {
    private int id, employee_age;
    private String employee_name;
    private double employee_salary;

    public Employee(int id, int employee_age, String employee_name, double employee_salary) {
        this.id = id;
        this.employee_age = employee_age;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public int getId() {
        return id;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }
}

package com.project.employment.services;

import com.project.employment.models.Employee;

import java.util.List;

public interface EmployeeServices {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(long id);
    Employee updateEmployee(Employee employee,long id);
    void deleteEmployee(long id);

}

package com.project.employment.services;


import com.project.employment.models.Employee;
import com.project.employment.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

    private EmployeeRepo employeeRepo;

    public EmployeeServicesImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;



    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeByID(long id) {
        return employeeRepo.findById(id).orElseThrow(null);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {

        Employee emp=employeeRepo.findById(id).orElseThrow(null);
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setEmail(employee.getEmail());

        employeeRepo.save(emp);

        return emp;
    }

    @Override
    public void deleteEmployee(long id) {
    employeeRepo.deleteById(id);
    }
}

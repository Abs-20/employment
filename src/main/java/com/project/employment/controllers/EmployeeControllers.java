package com.project.employment.controllers;


import com.project.employment.models.Employee;
import com.project.employment.services.EmployeeServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControllers {

    private EmployeeServices employeeServices;

    public EmployeeControllers(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeServices.getAllEmployees();
    }


    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee e=employeeServices.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(e);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee>  getEmployeeById(@PathVariable("id") long employeeId){
        //return new ResponseEntity<Employee>(employeeServices.getEmployeeByID(employeeId));
        Employee e=employeeServices.getEmployeeByID(employeeId);
        return ResponseEntity.status(HttpStatus.CREATED).body(e);

    }


    @DeleteMapping("{id}")
    public ResponseEntity<String>  deleteEmployeeById(@PathVariable("id") long employeeId){
        //return new ResponseEntity<Employee>(employeeServices.getEmployeeByID(employeeId))
        employeeServices.deleteEmployee(employeeId);
        return ResponseEntity.status(HttpStatus.CREATED).body("employee deleted");

    }

}

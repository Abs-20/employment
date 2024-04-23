package com.project.employment.repo;

import com.project.employment.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee,Long> {
}

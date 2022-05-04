package com.employee.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Employee.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}

package com.employee.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee.Entity.Employee;
import com.employee.Employee.Repository.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/addEmp")
	public Employee addEmpDetails(@RequestBody Employee emp)
	{
		return empRepo.save(emp);
		
	}
	
	@GetMapping("/getEmp")
	public List<Employee> printDetails()
	{
		return empRepo.findAll();
	}
	
	
	
	

}

package com.training.hibernatejpaTraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.hibernatejpaTraining.model.Employees;
import com.training.hibernatejpaTraining.service.IEmployeeService;

@RestController
@RequestMapping("company")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("employees/all")
	private List<Employees> findAllEmployees(){
		return employeeService.findAllEmployees();
	}
	
	@PostMapping("employees/add")
	private Employees addOrUpdate (@RequestBody Employees employees){
		return employeeService.addOrUpdate(employees);
	}
	
	@PostMapping("employees/add/many")
	private List<Employees> addManyEmployees (@RequestBody List<Employees> employees){
		return employeeService.addManyEmployees(employees);
	}
	
	@GetMapping("employees/name/{employeeName}")
	private List <Employees> findEmployeeByName(@PathVariable("employeeName") String employeeName){
		return employeeService.findEmployeeByName(employeeName);
	}
	
}

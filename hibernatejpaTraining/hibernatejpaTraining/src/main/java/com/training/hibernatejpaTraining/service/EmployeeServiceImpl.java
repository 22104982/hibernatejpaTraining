package com.training.hibernatejpaTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.hibernatejpaTraining.model.Employees;
import com.training.hibernatejpaTraining.repository.IEmployeesRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeesRepository employeesRepository;
	
	@Override
	public List<Employees> findAllEmployees() {
		return employeesRepository.findAll();
	}

	@Override
	public Employees addOrUpdate(Employees employees) {
		return employeesRepository.save(employees);
	}

	@Override
	public List<Employees> addManyEmployees(List<Employees> employees) {
		return employeesRepository.save(employees);
	}

	@Override
	public List<Employees> findEmployeeByName(String name) {
		return employeesRepository.findByEmployeeName(name);
	}
	
}

package com.training.hibernatejpaTraining.service;

import java.util.List;

import com.training.hibernatejpaTraining.model.*;

public interface IEmployeeService {

	List <Employees> findAllEmployees();
	Employees addOrUpdate (Employees employees);
	List<Employees> addManyEmployees (List<Employees> employees);
	List <Employees> findEmployeeByName (String name);
}

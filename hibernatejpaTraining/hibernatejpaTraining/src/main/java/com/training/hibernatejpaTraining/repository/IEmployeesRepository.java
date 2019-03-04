package com.training.hibernatejpaTraining.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.hibernatejpaTraining.model.Employees;

public interface IEmployeesRepository extends JpaRepository<Employees, Integer> {

	List<Employees> findByEmployeeName(String name);
	
}

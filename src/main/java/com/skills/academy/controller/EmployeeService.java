package com.skills.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skills.academy.entity.Employee;
import com.skills.academy.repository.EmployeeRepository;

@RestController
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@GetMapping("/")
	public List<Employee> getEmployee() {
		return repository.findAll();
	}

	@PostMapping(path = "/add", produces = "application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	/*
	 * @PutMapping(path = "/update", produces = "application/json") public Instance
	 * updateInstance(@RequestBody Instance customer) { return
	 * repository.save(customer); }
	 */
}

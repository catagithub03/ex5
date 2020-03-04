package com.ibm.academy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {

	// @Autowired
	// private InstanceRepository repository;

	@GetMapping("/")
	public String getEmployee() {
		return "Say Hello";
	}

	/*
	 * @GetMapping("/") public List<Instance> getInstances() { return
	 * repository.findAll(); }
	 * 
	 * @PostMapping(path = "/add", produces = "application/json") public Instance
	 * addInstance(@RequestBody Instance customer) { return
	 * repository.insert(customer); }
	 * 
	 * @PutMapping(path = "/update", produces = "application/json") public Instance
	 * updateInstance(@RequestBody Instance customer) { return
	 * repository.save(customer); }
	 */
}

package com.tek.springbootmongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.springbootmongodb.model.Employee;
import com.tek.springbootmongodb.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	public static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAll(){
		
		logger.debug("getAll() called");
		List<Employee> employees = employeeService.getAll();
		if(employees.isEmpty()){
			return new ResponseEntity<List<Employee>>(employees,HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id ){
		Employee employee = employeeService.getById(id);
		
		if(employee == null){
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
	}
	
	@PostMapping("/")
	public ResponseEntity<Employee> save(Employee employee){
		logger.debug("save() called");
		
		employee = employeeService.saveOrUpdate(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
}

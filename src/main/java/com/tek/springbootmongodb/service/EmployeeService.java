package com.tek.springbootmongodb.service;

import java.util.List;

import com.tek.springbootmongodb.model.Employee;

public interface EmployeeService {

	Employee saveOrUpdate(Employee e);

	void delete(int id);

	Employee getById(int id);

	List<Employee> getAll();

}

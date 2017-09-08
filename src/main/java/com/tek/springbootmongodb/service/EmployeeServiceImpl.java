package com.tek.springbootmongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.springbootmongodb.dao.EmployeeRepository;
import com.tek.springbootmongodb.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveOrUpdate(Employee emp) {

		return employeeRepository.save(emp);
	}

	@Override
	public void delete(int id) {
		employeeRepository.delete(id);

	}

	@Override
	public Employee getById(int id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

}

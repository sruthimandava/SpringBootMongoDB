package com.tek.springbootmongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tek.springbootmongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}

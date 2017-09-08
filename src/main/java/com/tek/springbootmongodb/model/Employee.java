package com.tek.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private Integer id;
	private String name;
	private String address;
	private String email;
	private Number mobileNumber;

	public Number getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Number mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, String email, Number mobileNumber) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}

}

package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	private Employee employee;
	private Department department;
	
	@Autowired
	public Company(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}

	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void showEmployeeInformation() {
		System.out.println("These are company employee");
	}
	
	public void showDepartmentInformation() {
		System.out.println("these is department ");
	}

}

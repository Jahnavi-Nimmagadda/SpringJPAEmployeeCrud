package com.capgemini.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.dao.EmployeeDaoI;
import com.capgemini.entities.Employee;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{
	@Autowired
	private EmployeeDaoI dao;
	
	public Employee CreateEmployee(Employee emp) {
		return dao.CreateEmployee(emp);
	}
	
	public Employee findEmployeeById(int empId) {
		return dao.findEmployeeById(empId);
	}
	public Employee updateEmployee(Employee emp) {
		return dao.updateEmployee(emp);
	}
	public List<Employee> findAllEmployees(){
		 return dao.findAllEmployees();
	}
	public void deleteEmployee(int empId) {
		 dao.deleteEmployee(empId);
	}
}
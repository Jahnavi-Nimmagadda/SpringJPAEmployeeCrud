package com.capgemini.dao;
import java.util.List;


import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entities.Employee;

@Repository
@Transactional
public class EmployeeDao implements EmployeeDaoI {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public Employee CreateEmployee(Employee emp) {
		return entityManager.merge(emp);
	}

	@Override
	public Employee findEmployeeById(int empId) {
		return entityManager.find(Employee.class,empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employee.setEmpAdd(employee.getEmpAdd());
		employee.setEmpName(employee.getEmpName());
		employee.setEmpSal(employee.getEmpSal());
		employee=entityManager.merge(employee);
		return employee;
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		Query q = entityManager.createQuery("select e from Employee e");
	    List<Employee> list=q.getResultList();
		return list;
	}
	@Override
	public void deleteEmployee(int empId) {
		Employee emp=entityManager.find(Employee.class, empId);
		entityManager.remove(emp);
	}

}

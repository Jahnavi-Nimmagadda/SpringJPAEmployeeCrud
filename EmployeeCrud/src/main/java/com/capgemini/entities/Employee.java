package com.capgemini.entities;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Employeetable1")
public class Employee {
	@Id
	@Generated(value = { "" })
private int empId;
private String empName;
private String empAdd;

public String getEmpAdd() {
	return empAdd;
}
public void setEmpAdd(String empAdd) {
	this.empAdd = empAdd;
}
private long empSal;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public long getEmpSal() {
	return empSal;
}
public void setEmpSal(long empSal) {
	this.empSal = empSal;
}
//constructor
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
}



}

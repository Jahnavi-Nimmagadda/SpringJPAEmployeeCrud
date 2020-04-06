package com.cg.jpacrud.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
StudentService service1= context.getBean("student_service",StudentServiceImpl.class);
		//Debug this program as Debug -> Debug as Java Application
		
	//	StudentService service1 = new StudentServiceImpl();
		
		Student student = new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id:");
		int studentId=sc.nextInt();
		System.out.println("enter student name:");
		String studentName=sc.next();
		student.setStudentId(studentId);
		student.setName(studentName);
		service1.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter student id to find:");
		int studentId1=sc1.nextInt();
		student = service1.findStudentById(studentId1);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		System.out.println("enter student name to set:");
		String studentName1=sc1.next();
		student.setName(studentName1);
		service1.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter student id to remmove the record:");
		int studentId2=sc2.nextInt();
		student = service1.findStudentById(studentId2);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		//at this breakpoint, record is removed from table
		service1.removeStudent(student);
		System.out.println("End of program...");
		
		
		

	}
}

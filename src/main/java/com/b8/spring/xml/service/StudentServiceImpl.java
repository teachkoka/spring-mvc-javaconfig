package com.b8.spring.xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.b8.spring.xml.model.Student;
import com.b8.spring.xml.respository.StudentRespository;

@Component
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRespository respository;

	public void processStudentData(Student student) {
		System.out.println("Recieved Data at Service and sending it to Repository");
		respository.persistStudentData(student);
		
	}
	

	
	
	
}

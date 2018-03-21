package com.b8.spring.xml.respository;

import org.springframework.stereotype.Component;

import com.b8.spring.xml.model.Student;

@Component
public class StudentRespository {
	
	public void persistStudentData(Student student){
		System.out.println("Persisted student data.");
	}

}

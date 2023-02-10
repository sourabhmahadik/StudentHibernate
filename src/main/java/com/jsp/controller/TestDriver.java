package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestDriver {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setId(4);
//		student.setName("sourabh101");
//		student.setEmail("sou@gmail.com");
//
//		StudentService studentService = new StudentService();
//		studentService.insertStudent(student);

	//	Student student =new Student();
	//	student.setId(3);
		
	//	StudentService studentService = new StudentService();
    //	studentService.deleteStudent(student);

//		Student student = new Student();
//	    student.setId(4);
//	    student.setName("sourabh");
//	    student.setEmail("s@gmail.com");
//	   
//	   StudentService studentService = new StudentService();
//	studentService.updateStudent(student);
		
		
		StudentService studentService = new StudentService();
        studentService.getAll( );
		
		
	}

}

package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao sd =new StudentDao();
	
	public Student insertStudent(Student s) {
		return sd.insertStudent(s);
		
	}
	
	public Student deleteStudent(Student s) {
		return sd.deleteStudent(s);
	}

	public Student updateStudent(Student s) {
		return sd.updateStudent(s);
}
	public void getAll() {
	 sd.getAll();
	}
}

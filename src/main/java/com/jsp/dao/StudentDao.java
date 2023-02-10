package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	public Student insertStudent(Student s) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sourabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		System.out.println("ALL GOOD");
		return s;
		
	}
	
	public Student deleteStudent(Student s) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sourabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		 Student s1=entityManager.find(Student.class,s.getId());
	    entityTransaction.begin();
		entityManager.remove(s1);
		entityTransaction.commit();
		System.out.println("ALL GOOD");
		return s1;
	}
	
	public Student updateStudent(Student s) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sourabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		 Student s1=entityManager.find(Student.class,s.getId());
		 if(s1!=null) {
		 s1.setName(s.getName());
		 s1.setEmail(s.getEmail());
		 
	    entityTransaction.begin();
		entityManager.merge(s1);
		entityTransaction.commit();
		System.out.println("ALL GOOD");
		 }
		 else 
			 System.out.println(" student not found");
		 
		return s1;
}
	public void getAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sourabh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String sql="select s from Student s";
		Query query =entityManager.createQuery(sql);
		List<Student> students=query.getResultList();
		for (Student student :students) {
			System.out.println("=============");
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			
			
			
		}
		
		
	}
}
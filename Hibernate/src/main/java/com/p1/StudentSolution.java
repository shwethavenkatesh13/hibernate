package com.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentSolution{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mouli");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();


		Student student=new Student();
		student.setId(3);
		student.setName("mouli");


		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

	}

}

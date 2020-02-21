package cts.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import cts.model.Student;
import cts.model.StudentIdentity;
import cts.util.JPAUtil;

public class ExampleForCompositePX {
	
	public static void main(String[] args) {
		Student s = new Student(new StudentIdentity(1,'A',7), "Shwetha", "Shetty", new Date(2013,6,4)) ;
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		System.out.println("student Saved!");
		JPAUtil.shutdown();

	}

}

package cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ms");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Emp e = new Emp();
		e.setEname("Megha");
		e.setSalary(50000);
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("inserted...");
		
	}

}

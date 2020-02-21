package cts.ui;

import javax.persistence.EntityManager;


import cts.util.JPAUtil;

public class CompositionDemoApp {
	public static void main(String[] args) {
		
		/*
		 * Faculty f = new Faculty(15,"Shwetha", new Address(12,
		 * "Serling Brooklin Apartment","Karnataka" ));
		 */
	EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		/* em.persist(f); */
		em.getTransaction().commit();
		
		System.out.println("fac Saved!");
		JPAUtil.shutdown();
		
	}

}

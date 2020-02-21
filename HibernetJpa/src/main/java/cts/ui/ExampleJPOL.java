package cts.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import cts.model.Employee;
import cts.util.JPAUtil;

public class ExampleJPOL {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		Employee emp = em.find(Employee.class, 14);
		
		if(emp!=null) {
			System.out.println(emp);
		}
		
		String gryString = "SELECT e FROM Employee e";
		Query gry = em.createQuery(gryString);
		
		display(gry.getResultList());
		
		display(em.createQuery("SELECT e FROM Employee e WHERE e.basic>20000").getResultList());
		
		List<String> names = em.createQuery("SELECT e.ename FROM Employee e").getResultList();
		for(String n : names) {
			System.out.println(n);
		}
		
		em.close();
		JPAUtil.shutdown();	
	}
	
	static void display(List<Employee> data) {
		System.out.println("-----------");
		for(Employee e : data) {
			System.out.println(e);
		}
		System.out.println("-------------------");
	}

}

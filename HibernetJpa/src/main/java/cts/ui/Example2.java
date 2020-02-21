
package cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.ContractEmp;
import com.cts.model.Emp;
import com.cts.model.Manager;

import cts.util.JPAUtil;

public class Example2 {
public static void main(String args[]) {
Emp e=new Emp(21,"vinu",12);
Manager m=new Manager(24,"ashu",13,1122);
ContractEmp c=new ContractEmp(23,"kittu",14,11);
EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
em.getTransaction().begin();
em.persist(e);
em.persist(m);
em.persist(c);
em.getTransaction().commit();
System.out.println("Emp Is Saved");
JPAUtil.shutdown();
}
}

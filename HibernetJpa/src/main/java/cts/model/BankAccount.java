package cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BankAccounts")
public class BankAccount {
	@Id
	private String accno;
	private String branchname;
	
	@OneToOne
	@JoinColumn(name="adhar")
	private Customer customer;

	public BankAccount() {
		
	}

	public BankAccount(String accno, String branchname, Customer customer) {
		super();
		this.accno = accno;
		this.branchname = branchname;
		this.customer = customer;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}

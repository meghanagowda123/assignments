package cts.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Cus1")
public class Customer {

	@Id
	@Column(name="adhar")
	private String adhar;
	private String name;
	
	@OneToOne(mappedBy="customer",cascade=CascadeType.ALL)
	private BankAccount account;

	public Customer() {
	
	}

	public Customer(String adhar, String name, BankAccount account) {
		super();
		this.adhar = adhar;
		this.name = name;
		this.account = account;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	
}

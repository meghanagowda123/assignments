package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity

/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="AllInOneEmps")
@DiscriminatorColumn(name="emp_type",
discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("emp")

@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="BaseEmps")*/
@Table(name="PQR")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)


public class Emp {
	@Id
	@Column(name="empno")

	private int empId;
	private String ename;
	private double basic;
	
	public Emp() {
		
	}
	public Emp(int empId, String ename, double basic) {
		
		this.empId = empId;
		this.ename = ename;
		this.basic = basic;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}		
	
}

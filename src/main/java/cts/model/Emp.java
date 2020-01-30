package cts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;


@Entity
@Table(name = "emp")
public class Emp {
private Integer empid;
private String ename;
private Integer salary;

@Column(name = "empid")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}

}


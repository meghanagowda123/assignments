package com.cts.model;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cemp2")
@Table(name="a")
public class ContractEmp extends Emp{
@Column
private int duration;
public ContractEmp() {

}
public ContractEmp(int empid,String ename,double basic,int duration) {
super(empid,ename,basic);

this.duration=duration;



}

// @Override
// public String toString() {
// return "Concrete [duration=" + duration + ", getDuration()=" + getDuration() + ", getEid()=" + getEid()
// + ", getEname()=" + getEname() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass()
// + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
// }
public int getDuration() {
return duration;
}
public void setDuration(int duration) {
this.duration = duration;
}

}
	
package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("mng2")
@Table(name="mgrs_onlu")

public class Manager extends Emp {
@Column(name="alwnce")
private  double allowance;
public Manager() {

}
public  Manager(int empid,String ename,double basic,double allowance) {
super(empid,ename,basic);
this.allowance=allowance;

}


//@Override
//public String toString() {
// return "Manager [allowance=" + allowance + ", getEid()=" + getEid() + ", getEname()=" + getEname() + ", getBasic()="
// + getBasic() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
// + super.toString() + "]";
//}
public double getAllowance() {
return allowance;
}
public void setAllowance(double allowance) {
this.allowance = allowance;
}

}


package com.cts.springs;

public class Student {
		
	String sName;
	int regId;
	String address;
	
//	public Student(String sName, int regId, String address) {
//		this.sName = sName;
//		this.regId = regId;
//		this.address = address;
//	}	
	
	void person() {
		
		System.out.println("Student details: \n Name: " + this.getsName()+ ", ID : " + this.getRegId()+", Address:"+this.getAddress());
		
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public int getRegId() {
		return regId;
	}
	
	public void setRegId(int regId) {
		this.regId = regId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
		
}

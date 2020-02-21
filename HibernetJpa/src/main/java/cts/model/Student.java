package cts.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "TabStudents")
public class Student {
	
	@EmbeddedId
	private StudentIdentity vid;
	
	@Column(name="fnm",nullable=false)
	private String firstName;
	
	@Column(name="lnm")
	private String lastName;
	
	@Column(name="dub",nullable=false)
	private Date dateOfBirth;
	
	public Student() {
	}

	public Student(StudentIdentity vid, String firstName, String lastName, Date dateOfBirth) {
		super();
		this.vid = vid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public StudentIdentity getVid() {
		return vid;
	}

	public void setVid(StudentIdentity vid) {
		this.vid = vid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	}
	

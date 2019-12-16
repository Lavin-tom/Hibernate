package com.face.hibernate.student;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {

	@Id
	private int stid;
	private String name;
	private String gender;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}

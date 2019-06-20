package com.test.junit;

public class Library {
	
	String studentName;
	int roll;
	
	public Library(String studentName, int roll) {
		super();
		this.studentName = studentName;
		this.roll = roll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	

}

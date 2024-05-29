package com.ts;

public class Student {
	
	private Teacher t;
	
	public Teacher getT() {
		return t;
	}
	public Student() {} 
	public Student(Teacher t) {
		this.t = t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public void stdMethod() {
		System.out.println("I am student method");
		
		t.tchMethod();
	}
}

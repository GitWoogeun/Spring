package com.javaclass.model;

public class MemberVO {
	
	private String id;
	private String name;
	private int age;
	
	private boolean state;
	
	//boolean은 getter 대신 is가 만들어진다.
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
		
	//getter 와 setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

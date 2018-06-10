package com.di.beans;

public class Students {
	
	String name;
	String add;
	int age;
	
	public Students(String name, int age, String add) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", add=" + add + ", age=" + age + "]";
	}
	
	

}

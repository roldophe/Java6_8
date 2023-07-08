package com.Radom.java.OnlineCourse.OPP.Constructors;

public class Employee {
	String name;
	String gender;
	int age;

	public Employee() {
		name = "RADOOM KHOEM";
		gender = "M";
		age = 19;
	}

	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}

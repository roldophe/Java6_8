package com.Radom.java.OnlineCourse.OPP.Constructors;

public class Student {
	private String name;
	private int age;

	
	//Default constructor no argument
	public Student() {
		name = "RADOM KHOEM";
		age = 23;
	}
	
	//Constructor with parameterized
	public Student(String addrName, int addrAge)
	{
		name = addrName;
		age = addrAge;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String addrName) {
		this.name = addrName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int addrAge) {
		this.age = addrAge;
	}
	public void display()
	{
		System.out.println("Name: %s Age: %d ".formatted(name, age));
	}

}

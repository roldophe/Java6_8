package com.Radom.java.OnlineCourse.Test;

public class GeneralTest {

	public class Employee {

	    private String name;
	    private int age;
	    private Gender gender;

	    public Employee(String name, int age, Gender gender) 
	    {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        printGender();
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

	    public Gender getGender() {
	        return gender;
	    }

	    public void setGender(Gender gender) 
	    {
	        this.gender = gender;
	    }

	    public final void printGender() {
	        System.out.println(gender.name().toLowerCase());
	    }    
	}

}

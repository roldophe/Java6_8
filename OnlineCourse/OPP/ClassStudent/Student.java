package com.Radom.java.OnlineCourse.OPP.ClassStudent;

public class Student {
	// Data Members//State
	private String name;
	private String gender;
	private int age;

	// Behavior or Methods
	public void setName(String n) {
		if ((n != null) && !n.equals("") && (n.matches("^[a-zA-Z]*$"))) {
			this.name = n;
		}
	}

	public void setGender(String sex) {

		if (sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("F")) {
			this.gender = sex;
		}

	}

	public void setAge(int a) {
		if (a >= 0)
			this.age = a;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String toData() {
		return "\n\tFull-Name = %s; Gender = %s; Age= %d".formatted(name, gender, age);
	}
}

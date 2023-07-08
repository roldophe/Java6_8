package com.Radom.java.OnlineCourse.OPP.Inheritance.Teacher;

public class Student extends Person {
	private char grade;

	public Student() {
		super("ROLDOPHE", "M", 15);
		this.grade = 'A';

	}

	@Override
	public String toString() {
		return "Student [name= " + name + ", gender=" + gender + ", age=" + age + ", grade=" + grade + "]";
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}

package com.Radom.java.OnlineCourse.OPP.Inheritance.Teacher;

public class SchoolApplication {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student s = new Student();
		// System.out.println(t.info());
		System.out.println(t.toString());
		t.disNationality();
		System.out.println(s.toString());

	}

}

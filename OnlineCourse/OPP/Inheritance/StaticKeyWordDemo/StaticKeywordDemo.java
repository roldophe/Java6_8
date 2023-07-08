package com.Radom.java.OnlineCourse.OPP.Inheritance.StaticKeyWordDemo;

public class StaticKeywordDemo {

	public static void main(String[] args) {
		Student s1 = new Student("RADOM", Gender.MALE, Grade.THREE);
		Student s2 = new Student("ROLDOPHE", Gender.FEMALE, Grade.ONE);

		s1.setName("Louiz");
		// s2.numberOfstudent = 25;
		Student.numberOfstudent = 25;
		System.out.println(s1);
		System.out.println(s2);
		// s1.print();
	}

}

package com.Radom.java.OnlineCourse.OPP.ClassStudent;

public class StudentApp {

	public static void main(String[] args) {
		 Student st1 = new Student();
		 //st1.age=23;
		 /*
		  * Set date
		  */
		 st1.setName("RADOM KHOEM");
		 st1.setGender("M");
		 st1.setAge(20);
		 /*
		  * getData
		  */
		 System.out.println(st1.getName());
		 System.out.println(st1.getGender());
		 System.out.println(st1.getAge());
		 
		 /*
		  * Output all date
		  */
		 System.out.println(st1.toData());
	}

}

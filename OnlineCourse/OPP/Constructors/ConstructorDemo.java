package com.Radom.java.OnlineCourse.OPP.Constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		/****************Methods set and get**************
		**************************************************/
			
					/*
					Student student = new Student();
					student.setName("RADOM");
					System.out.println(student.getName());
					student.setAge(12);
					System.out.println(student.getAge());
					*/
		
		/******Constructor with parameterized**************
		***************************************************/
		
					/*
					Student student = new Student("RADOM KHOEM",23);
					student.display();
					*/
		
		/************Constructor non-parameter ************
		***************************************************/
					/*
					Student student = new Student();
					student.display();
					*/
		
		/**************Default constructor*****************
		***************************************************/
				/*
				Book b1 = new Book();
				//have function set();
				b1.setTitle("Java Book");
				b1.setPrice(10);
				System.out.println(b1.toString());
				*/
		
		/**************Constructor Overloading**************
		 * Constructor Employee are difference 
		 * between number of Parameters
		****************************************************/
		
				Employee emp1 = new Employee(); //no argument
				System.out.println(emp1.toString());
				System.out.println("--------------------");
				
				//have argument
				Employee emp2 = new Employee("RADOM", "M", 28); 
				System.out.println(emp2.toString());
				
		
		
		/***** This is keyword for calling constructor*******
		****************************************************/
				/*
				Person per = new Person();
				System.out.println(per.toString());
				*/
	}

}

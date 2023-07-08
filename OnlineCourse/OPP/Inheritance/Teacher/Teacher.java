package com.Radom.java.OnlineCourse.OPP.Inheritance.Teacher;

public class Teacher extends Person {
	private double salary;
	private String nationality =" Thai";
	final int HOUR = 10;
	public Teacher() {
		super("RADOM KHOEM", "Male", 30);
		this.salary = 100;
	}
	public void disNationality() {
		//System.out.println(nationality);
		System.out.println(super.nationality);
	}
	String info() {
		return ("\t" + name + "\t" + gender + "\t" + age + "\t" + salary + "$");
	}

//	@Override
//	public String toString() {
//		//return name;
//		return super.toString()+"";
//	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Teacher [" + "name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + "$]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

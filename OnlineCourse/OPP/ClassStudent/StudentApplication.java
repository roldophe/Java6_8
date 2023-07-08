package com.Radom.java.OnlineCourse.OPP.ClassStudent;

public class StudentApplication {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		//Student st = studentService.createStudent();
		//System.out.println(st.getName() + " " + st.getGender() + " " + st.getAge());
		
		int numberOfStudent = 2;
		Student[] studentArray = studentService.createStudentArray(numberOfStudent);
		
		studentService.print(studentArray);

		System.out.println("Aftter Sorting by Name");
		studentService.sortByName(studentArray);
		studentService.print(studentArray);
		
		System.out.println("Aftter Sorting by Age");
		studentService.sortByAge(studentArray);
		studentService.print(studentArray);
		
		System.out.println("The oldest student is: ");
		Student oldestStudent=studentService.getOldestStudent(studentArray);
		System.out.println(oldestStudent.toData());
	}
}







/*
for (int i = 0; i < numberOfStudent; i++) {
System.out.println("\tStudent#"+(i+1)+studentArray[i].toData());
//System.out.println((studentArray[i].getName()+" "+studentArray[i].getGender()+" "+studentArray[i].getAge()));
}
*/
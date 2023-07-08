package com.Radom.java.OnlineCourse.OPP.ClassStudent;

//import java.net.Socket;
import java.util.Scanner;

public class StudentService {

	@SuppressWarnings("resource")
	public Student createStudent() {
		Scanner input = new Scanner(System.in);
		Student st = new Student();

		System.out.print("Enter Name  :");
		st.setName(input.next());

		System.out.print("Enter Gander:");
		st.setGender(input.next());

		System.out.print("Enter Age   : ");
		st.setAge(input.nextInt());
		return st;
	} // end set and get

	
	public Student[] createStudentArray(int n) {
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\tStudent#" + (i + 1));
			students[i] = createStudent();
		}
		return students;
	} // end set array

	public void print(Student[] students) {
		for (Student st : students) {
			System.out.println(st.toData());
			// System.out.println(st);
		}
	}// end get array

	// Sorting by Name
	public void sortByName(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getName().compareTo(students[j].getName()) > 0) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;

				}
			}
		}

	}// end sortName

	// Sorting By Age
	public void sortByAge(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getAge() > students[j].getAge()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;

				}
			}
		}

	}// end sortAge

	public Student getOldestStudent(Student[] students) {
		Student maxStudent = students[0];
		for (int i = 0; i < students.length; i++) {
			if (maxStudent.getAge() < students[i].getAge())
				maxStudent = students[i];
		}
		return maxStudent;
	}
}

package com.Radom.java.OnlineCourse.OPP.ClassPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonService {
	@SuppressWarnings("resource")
	public Person createPerson() throws IOException {
		Scanner input = new Scanner(System.in);
		Person per = new Person();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("Input person's detail...: ");
		System.out.print("First Name  : ");
		per.setFirstName(input.next());

		System.out.print("  Last Name : ");
		per.setLastName(input.next());

		System.out.print("     Gender : ");
		per.setGender(input.next());

		System.out.print("        Age : ");
		per.setAge(input.nextInt());

		System.out.print("      Email : ");
		per.setEmail(input.next());

		System.out.print("    Address : ");
		per.setAddrAddress(reader.readLine());

		System.out.print("Phone Number: ");
		per.setPhoneNumber(input.next());

		return per;

	}

	public Person[] createPersonArray(int n) throws IOException {
		Person[] persons = new Person[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\tPerson#" + (i + 1));
			persons[i] = createPerson();
		}
		return persons;
	}

	public void print(Person[] persons) {
		for (Person per : persons) {
			System.out.println(per.getAllData());
		}
	}

//	public void print(Person[] persons) {
//		for (Person st : persons) {
//			System.out.println(st.getAllData());
//			// System.out.println(st);
//		}
//	}

}

package com.Radom.java.OnlineCourse.OPP.ClassPerson;

import java.io.IOException;
import java.util.Scanner;

public class PersonApplication {

	public static void main(String[] args) throws IOException {
		PersonService personService = new PersonService();
		// Person per = personService.createPerson();
		// System.out.print(per.getAllData());
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter Number of Person: ");
			int numberOfPerson = scanner.nextInt();
			Person[] personArray = personService.createPersonArray(numberOfPerson);
			personService.print(personArray);
		}
	}

}

/*
 * Input for one person Person per = personService.createPerson();
 * System.out.print(per.getAllData());
 */
// Scanner input = new Scanner(System.in);
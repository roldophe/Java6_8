package ClassPerson;

import java.util.Scanner;

public class PersonService {
    Person createPerson() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input id: ");
        person.id = scanner.nextInt();
        System.out.print("Please input first name: ");
        person.firstName = scanner.next();
        System.out.print("Please input last name : ");
        person.lastName = scanner.next();
        System.out.print("Please input gender: ");
        person.gender = scanner.next();
        System.out.print("Please input address: ");
        person.address = scanner.next();
        System.out.print("Please input DOB: ");
        scanner.nextLine();
        person.dateOfBirth = scanner.nextLine();
        return person;
    }

    public void print(Person person) {
        System.out.println("Person ID:  " + person.id);
        System.out.println("Person Name: "+ person.firstName +" "+ person.lastName);
        System.out.println("Person Gender: " + person.gender);
        System.out.println("Person Address: " + person.address);
        System.out.println("Person Date of birth:  " + person.dateOfBirth);
    }
}

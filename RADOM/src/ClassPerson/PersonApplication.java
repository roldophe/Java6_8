package ClassPerson;

import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {
//        for one person
//        PersonService personService = new PersonService();
//        Person person = personService.createPerson();
//        personService.print(person);
//
        //For people
        int numbersOfPeople;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of people: ");
        numbersOfPeople = scanner.nextInt();
        System.out.println("There are "+numbersOfPeople+"people.");
        PersonService personServices = new PersonService();
        Person[] people = personServices.createPeople(numbersOfPeople);
        System.out.println("There are "+numbersOfPeople+"people.");
        System.out.println("______________________________________");
        personServices.prints(people);

    }


}

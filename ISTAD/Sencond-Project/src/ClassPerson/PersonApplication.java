package ClassPerson;

import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonService personService = new PersonService();
        Person person = personService.createPerson();
        personService.print(person);


    }
}

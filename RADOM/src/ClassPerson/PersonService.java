package ClassPerson;

import java.util.Scanner;

public class PersonService {
    public Person createPerson() {
        int addrId = getInt("Please input ID: ");
        String addrFirstName = getString("Please input FirstName: ");
        String addrLastName = getString("Please input lastName: ");
        String addrGender = getString("Please input Gender: ");
        byte addrAge = getByte("Please input Age: ");
        String addrDate = getStringLn("Please input Date: ");
        Person person = new Person(addrId, addrFirstName, addrLastName, addrGender, addrAge, addrDate);
        return person;
    }
    public Person[] createPeople(int addrNumberOfPeron){
        Person[] people = new Person[addrNumberOfPeron];
        for (int i=0; i<people.length; i++){
            System.out.println("Person["+(i+1)+"]:");
            people[i]=createPerson();
        }
        return people;
    }
    public void print(Person person){
        System.out.println(person.toString());
    }
    public void prints(Person[] person){
        for (int i=0; i<person.length; i++){
            System.out.println("Person["+(i+1)+"]:");
            System.out.println(person[i].toString());
        }
    }
    public String getString(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public String getStringLn(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.nextLine();
    }
    public int getInt(String label) {
        String text = getString(label);
        return Integer.parseInt(text);
    }
    public byte getByte(String label) {
        String text = getString(label);
        return Byte.parseByte(text);
    }
}

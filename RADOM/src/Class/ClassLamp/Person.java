package Class.ClassLamp;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    String gender;
    byte age;

    public Person(int addrId, String addrName, String addrGender, byte addrAge) {
        this.id = addrId;
        this.name = addrName;
        this.gender = addrGender;
        this.age = addrAge;
    }

    public Person() {
        this.id = 0;
        this.name = "null";
        this.gender = "null";
        this.age = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" + "id: " + id + ", name: " + name + ", gender: " + gender + ", age: " + age + ']';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();//Person(101, "RADOM KHOEM", 'M', (byte) 21);
        System.out.print("Enter id: ");
        person.setId(scanner.nextInt());
        System.out.print("Enter Name: ");
        person.setName(scanner.next());
        System.out.print("Enter gender: ");
        person.setGender(scanner.next());
        System.out.print("Enter age: ");
        person.setAge(scanner.nextByte());
        System.out.println(person.toString());

    }
}

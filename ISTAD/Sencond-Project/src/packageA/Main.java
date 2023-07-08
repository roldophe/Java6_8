package packageA;

import packageB.Student;
class Person {
    private int id;
    private String name;
    private String address;

    private void messagePerson(){
        System.out.println("This is massage of person class.");
    }


}
public class Main {
    public static void main(String[] args) {

        //Call class Student from packageB
        Student obj = new Student();
        obj.name = "RADOM";
        obj.gender="Male";
        obj.message();
        Person person = new Person();

        //create object person
        Robot robotObject = new Robot();
        robotObject.serialNumber=1001;
        robotObject.chipSet = "Tesla ModeLXY";
    }
}

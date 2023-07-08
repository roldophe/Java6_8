package Encapsulation.EncapsulationDemoII;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        //Setting values of the variables
        person.setName("RADOM");
        person.setAge(12);
        person.setGender("Male");

        //Displaying values of the variables
        System.out.println("Name: "+person.getName());
        System.out.println("Gender: "+person.getGender());
        System.out.println("Age: "+person.getAge());

        //Direct access of variables is not possible

    }
}

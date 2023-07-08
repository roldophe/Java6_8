package Inheritance.Person;

public class Person {
    //public final class Person :
    // if you want to extend another class shouldn't use final before Superclass
    protected String name;
    protected String gender;
    protected int age;
    protected String nationality = "Cambodian";

    Person() {
        System.out.println("This is a default constructor.");
    }

    final public void showInfo(){
        System.out.println("This from person class.");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    Person(String name) {
        this(name, "null", 0);
    }
    Person(String name, String gender) {
        this(name, gender, 0);
    }
    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

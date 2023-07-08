package Encapsulation.EncapsulationDemoII;

public class Person {
    //private variables declared
    //these can only be accessed by
    //public methods of class

    private String name;
    private String gender;
    private int age;
    //get method for variables to access
    public String getName(){return name;};
    public String getGender(){return gender;}
    public int getAge(){return age;}
    //set method for variables to access
    public void setName(String name){this.name=name;}
    public void setGender(String gender){this.gender=gender;}
    public void setAge(int age){this.age=age;}

}

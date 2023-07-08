package ArrayList.ArraylistPractice;

import java.util.ArrayList;
import java.util.List;

public class Programmer implements Service{
    private int id;
    private String name;
    private String gender;
    private int age;
    private String position;
    private int numberOfProject;
    private List<String> skills = new ArrayList<>();
    private float salary;

    public Programmer(){}
    public Programmer(int id, String name, String gender, int age,String position,int numberOfProject,List<String> skills,float salary){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.position=position;
        this.numberOfProject=numberOfProject;
        this.skills=skills;
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public Programmer insert() {
        System.out.println("====<<<<Please insert Programmer Information>>>>====");
        id=Utils.getInt("Input id: ");
        name=Utils.getStringLn("Input name:");
        gender=Utils.getStringLn("Input gender: ");
        age=Utils.getInt("Input age: ");
        position=Utils.getStringLn("Input position: ");
        numberOfProject=Utils.getInt("Input number of projects: ");
        int number= Utils.getInt("Input number of skills: ");
        for (int i=0; i<number;i++)
            skills.add(i, Utils.getString("\t\tSkill[" + (i + 1) + "]: "));
        salary=Utils.getFloat("Salary: ");
        return this;
    }
    @Override
    public Programmer update() {
        name=Utils.getStringLn("Input name:");
        gender=Utils.getStringLn("Input gender: ");
        age=Utils.getInt("Input age: ");
        position=Utils.getStringLn("Input position: ");
        numberOfProject=Utils.getInt("Input number of projects: ");
        int number= Utils.getInt("Input number of skills: ");
        for (int i=0; i<number;i++)
            skills.set(i, Utils.getString("\t\tSkill[" + (i + 1) + "]: "));
        salary=Utils.getFloat("Salary: ");
        return this;
    }

    @Override
    public void show() {
        System.out.println("=========<<Programmer Information>>========");
        System.out.println("\t\tID : "+id);
        System.out.println("\t\tName: "+name);
        System.out.println("\t\tGender: "+gender);
        System.out.println("\t\tAge: "+age);
        System.out.println("\t\tPosition: "+position);
        System.out.println("\t\tProject: "+numberOfProject+((numberOfProject>1)?"projects":"project"));
        System.out.println("\t\tSkills: "+skills);
        System.out.println("\t\tSalary:$ "+salary);
    }
    @Override
    public String getObjectType() {
        return this.getClass().getSimpleName();
    }
}

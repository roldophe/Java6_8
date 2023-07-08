package Model;

public class Employer {
    private int id;
    private String name;
    private String gender;
    private String position;
    private int age;

    public Employer() {
    }

    public Employer(int id, String name, String gender, String position, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.age = age;
    }
    //getter and setter
    //getter->read permission
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
}

package Class.ClassAndObject;

public class Student {
    //state
    private String name;
    private String gender;
    private int age;

    //behavior
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toInfo() {
        return ("Name : " + name + " Gender: " + gender + " Age: " + age);
    }

    @Override
    public String toString() {
        return "[" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + ']';
    }
}

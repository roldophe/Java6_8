package Class.ClassStudent;

public class Student {
    private String name;
    private String gender;
    private int age;
    char letter;

    void setAge(int addrAge) {
        if (addrAge >= 0)
            this.age = addrAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String toData() {
        return ("Name: " + name + " Gender: " + gender + " Age: " + age);
    }
}

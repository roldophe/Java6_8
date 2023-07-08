package ClassPerson;

public class Person {
    int id;
    String firstName;
    String lastName;
    String gender;
    byte age;
    String date;

    public Person(int addrId, String addrFirstName, String addrLastName, String addrGender, byte addrAge, String addrDate) {
        this.id = addrId;
        this.firstName = addrFirstName;
        this.lastName = addrLastName;
        this.gender = addrGender;
        this.age = addrAge;
        this.date = addrDate;
    }
    public void setId(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setGender(String gender) {this.gender = gender;}
    public void setAge(byte age) {this.age = age;}
    public void setDate(String date) {this.date = date;}
    public String toString(){
        return ("ID: %d FirstName: %s LastName: %s Gender: %s Age: %d Date: %s"
                .formatted(id,firstName, lastName,gender,age,date));
    }
}

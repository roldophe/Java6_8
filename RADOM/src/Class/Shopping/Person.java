package Class.Shopping;

public class Person {

    private String firstName, lastName, address;
    private int age;
    private boolean hasAddress = false;
    private boolean hasAge = false;
    private static final String NO_ADDRESS = "No address defined";

    //Constructors

    //Minimum information required
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //All possible info
    public Person(String firstName, String lastName, int age, String address) {
        this(firstName, lastName);
        this.age = age;
        this.address = address;
        hasAge = true;
        hasAddress = true;
    }

    //No address defined
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
        hasAge = true;
    }

    //No age defined
    public Person(String firstName, String lastName, String address) {
        this(firstName, lastName);
        this.address = address;
        hasAddress = true;
    }

    //Methods

    //Get-methods
    public String getName() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        if (hasAge)
            return age;
        else
            return 0; //Return 0 if no age is defined
    }

    public String getAddress() {
        if (hasAddress)
            return address;
        else
            return NO_ADDRESS;
    }

    //Set-methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


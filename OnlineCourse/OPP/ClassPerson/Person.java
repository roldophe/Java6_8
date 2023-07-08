package com.Radom.java.OnlineCourse.OPP.ClassPerson;

public class Person {
    private String addrFirstName;
    private String addrLastName;
    private String addrGender;
    private int age;
    private String addrEmail;
    private String addrAddress;
    private String addrPhoneNumber;

    // set data
    public void setFirstName(String firstName) {
        if ((firstName != null) && !firstName.equals("") && (firstName.matches("^[a-zA-Z]*$"))) {
            this.addrFirstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if ((lastName != null) && !lastName.equals("") && (lastName.matches("^[a-zA-Z]*$"))) {
            this.addrLastName = lastName;
        }
    }

    public void setGender(String gender) {
        if ((gender != null) && gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")) {
            this.addrGender = gender;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if ((email != null)) {
            this.addrEmail = email;
        }
    }

    public void setAddrAddress(String address) {
        if ((address != null)) {
            this.addrAddress = address;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if ((phoneNumber != null) && !phoneNumber.equals("") && (phoneNumber.matches("^[0-9]*$"))) {
            this.addrPhoneNumber = phoneNumber;
        }
    }

    // get date
    public String getFirstName() {
        return addrFirstName;
    }

    public String getLastName() {
        return addrLastName;
    }

    public String getGender() {
        return addrGender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return addrEmail;
    }

    public String getAddress() {
        return addrAddress;
    }

    public String getPhoneNumber() {
        return addrPhoneNumber;
    }

    public String getAllData() {
        return ("\n\tFull-Name: %s   %s;  Gender: %s;  Age: %d; \n\tEmail: %s;  Address: %s;  PhoneNumber: %s"
                .formatted(addrFirstName, addrLastName, addrGender, age, addrEmail, addrAddress, addrPhoneNumber));
    }


}

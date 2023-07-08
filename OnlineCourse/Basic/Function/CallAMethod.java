package com.Radom.java.OnlineCourse.Basic.Function;

public class CallAMethod {
    public static void main(String[] args) {
        myMethod();
        fName("RAODM");
        fName("Roldophe");
        fName("Luoiz");
        fName("Enzo");
        fNameAndAge("RADOM", (byte) 18);
        fNameAndAge("ROLDPOHE", (byte) 17);
        fNameAndAge("LUOIZ", (byte) 21);
        fNameAndAge("RANDOM", (byte) 23);
        fNameAndAge("ENZO", (byte) 21);
    }
    public static void myMethod(){
        System.out.println("I just got executed!");
    }
    public static void fName(String fName){
        System.out.println(fName+" KHOEM");
    }
    public static void fNameAndAge(String name, byte age){
        System.out.println("My "+name+". I'm "+age+" years old.");
    }

}

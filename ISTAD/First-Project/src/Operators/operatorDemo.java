package Operators;

public class operatorDemo {
    public static void main(String[] args) {
        //schoolarship application
        //gender=female
        //age>=18
//      Relational Operators
        boolean isFemale = true; //female
        int age = 18;
        boolean isTopStudent = true;

        //Logical AND(&&)
        //Logical OR(||)
//        if(isFemale || age>=18 || isTopStudent)

        if(isFemale && age>=18 && isTopStudent){
            System.out.println("You are qualified for scholarship");
        }
        else {
            System.out.println("Your are not qualified for scholarship");
        }

//        boolean isFemale = false; //male
//        int age = 17;
//        if (isFemale == true) {
//            if (age >= 18) {
//                System.out.println("You are qualified for the scholarship");
//            } else {
//                System.out.println("Age is not qualified!");
//            }
//        } else {
//            System.out.println("Your gender is not qualified!");
//        }
    }
}

package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //scholarship application
        boolean isFemale = true; //female
        int age=18;
        boolean isTopStudent = true;

        //using logical OR(||)

        if(isFemale || age>=18 || isTopStudent){
            System.out.println("You are qualified for scholarship.");
        }
        else{
            System.out.println("You are not qualified for scholarship.");
        }

    }
}

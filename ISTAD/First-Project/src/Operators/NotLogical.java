package Operators;

public class NotLogical {
    public static void main(String[] args) {
        boolean isValid = true;

        //! used in front od boolean expression
        if(!isValid){
            System.out.println("The condition is valid.");
        }
        else {
            System.out.println("Condition is valid.");
        }
    }
}

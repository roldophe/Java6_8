package Demo;

public class FinallyDemo {
    public static void main(String[] args) {
        //finally: ensure that code inside the finally block is working.
        //des[ite there is an exception or not
        try {
            int result = 10/0;
            System.out.println("Here is the value of the result: "+result);
        }catch (ArithmeticException ex){
            System.out.println("Exception error is: "+ex.getMessage());
        }finally {
            //close connection
            //clear cache
            //do some clean-up works
            System.out.println("This block will always works!!");
        }


    }
}

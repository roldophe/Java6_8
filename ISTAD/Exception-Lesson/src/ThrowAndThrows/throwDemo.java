package ThrowAndThrows;
//Java program to demonstrate the working
// of throw keyword in exception handling
public class throwDemo {
    public static void main(String[] args) {
        //use of unchecked Exception
        try{
            double x =3/0;
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}

package LambdaReview;

@FunctionalInterface
interface IFeature {
    void login(String credential);
}

public class LambdaReview {
    public static void main(String[] args) {
        //using lambda,
        // That lambda can only be used to implement functional interface
        // that an interface with one abstract method.
        IFeature obj = credit -> {
            System.out.println("Credential is: " + credit);
            System.out.println("login method has been override.");
        };
        obj.login("User admin");

    }
}

package MethodReference;

@FunctionalInterface
interface IFeature {
    String signUp(String credential);
}

class Utils {
    static String GoogleSignUp(String credential) {
//        System.out.println("Credential: "+credential);
        System.out.println("This allow you sign up with google!");
        return credential;
    }

    static void facebookSignup() {
        System.out.println("This allow you sign up with facebook!");
    }
}

public class Main {
    public static void main(String[] args) {
        // IFeature feature =()-> System.out.println("This is sign up");//normal lambda

        //feature.signUp();
        //method reference to the static method
        //IFeature socialFeature = Utils::facebookSignup;
        IFeature socialFeature = Utils::GoogleSignUp;
        var username = socialFeature.signUp("Mr.DOM");
        System.out.println("Username: " + username);
    }
}

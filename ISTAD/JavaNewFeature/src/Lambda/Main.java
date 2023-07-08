package Lambda;

@FunctionalInterface
interface IFeature {
    void login(String credential); //abstract method
}

//inheritance
//class Feature implements IFeature{
//    @Override
//    public void login() {
//        System.out.println("This login method()!");
//    }
//}
public class Main {
    public static void main(String[] args) {
        IFeature obj = new IFeature() {
            @Override
            public void login(String credential) {
                System.out.println("Login method has been overridden!");
            }
        };
        obj.login("user admin");

        //using lambda
        IFeature obj1 = (credit) -> System.out.println("Credential is: " + credit);
        obj1.login("user farmer");
    }
}

package Interface.InterfaceDemo;


//-> fully abstract class
//-> use with multiple inheritance
//-> loosely coupling
//-> make use with new features of java(lambda,...)
interface IFeature{
    //constant
    String MESSAGE = "From IFeature!";
    String username ="roldophe";
    void login();
    void logout();
}
// inheritance between interface -> interface: extends
// inheritance between class from interface : implements
// class with class:  extends
class Feature implements IFeature{
    @Override
    public void login() {
        System.out.println("Admin name is :"+IFeature.username);
        System.out.println("Message: "+ MESSAGE);
        System.out.println("Message");
        System.out.println("This is the login features.");
    }
    @Override
    public void logout() {
        System.out.println("This is the logout features.");
    }
}
public class Main {
    public static void main(String[] args) {
        Feature obj  =  new Feature();
        obj.login();
        obj.logout();
    }
}

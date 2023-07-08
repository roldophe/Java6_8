package Interface.AbstractionSpolierII;

interface IFeature {
    void login();
}

//1. create child class
class FeatureA implements IFeature {

    @Override
    public void login() {
        System.out.println("Successfully loginA!");
    }

}
class FeatureB implements IFeature {
    @Override
    public void login() {
        System.out.println("Successfully loginB!");
    }
}
//2. anonymous class
//3. used lambda for the functional interface

public class Main {
    public static void main(String[] args) {
        IFeature obj2 = new FeatureA();
                 obj2.login();
                 obj2 = new FeatureB();
                 obj2.login();
        IFeature obj = ()-> System.out.println("Login with lambda");
        obj.login();
        //DownCasting (Parent to Child)
    }
}

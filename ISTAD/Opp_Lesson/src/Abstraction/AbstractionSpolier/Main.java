package Abstraction.AbstractionSpolier;

abstract class AFeature {
    abstract void login();

    abstract void logout();
}

class Feature extends AFeature {

    @Override
    void login() {
        System.out.println("login successfully");
    }

    @Override
    void logout() {
        System.out.println("logout successfully!");
    }
}

public class Main {
    public static void main(String[] args) {
        Feature feature = new Feature();
        feature.login();
        feature.logout();
    }
}

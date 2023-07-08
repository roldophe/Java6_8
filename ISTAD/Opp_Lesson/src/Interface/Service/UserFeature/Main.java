package Interface.Service.UserFeature;

import Interface.Service.ServiceImplement.UserServiceVersionOne;

public class Main {
    public static void main(String[] args) {
        UserFeature userFeature = new UserFeature(new UserServiceVersionOne());
        userFeature.loginWithFacebook();
        userFeature.loginWithGoogle();
    }
}

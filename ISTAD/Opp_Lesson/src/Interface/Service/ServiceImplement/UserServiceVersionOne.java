package Interface.Service.ServiceImplement;

import Interface.Service.UserService;

public class UserServiceVersionOne implements UserService {
    @Override
    public void login() {
        System.out.println("This is login version one.");
    }

    @Override
    public void logout() {
        System.out.println("This is logout version one.");
    }

    @Override
    public void loginWithGoogle() {
        System.out.println("This is login with Google Version One.");
    }

    @Override
    public void loginWithFacebook() {
        System.out.println("This is login with Facebook Version two.");
    }
}

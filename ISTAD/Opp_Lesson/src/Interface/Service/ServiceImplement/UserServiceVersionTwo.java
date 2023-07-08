package Interface.Service.ServiceImplement;

import Interface.Service.UserService;

public class UserServiceVersionTwo implements UserService {
    @Override
    public void login() {
        System.out.println("This is login version two.");
    }

    @Override
    public void logout() {
        System.out.println("This is logout version two.");

    }

    @Override
    public void loginWithGoogle() {
        System.out.println("This is login with google version two.");
    }

    @Override
    public void loginWithFacebook() {
        System.out.println("This is login with facebook version two.");
    }
}

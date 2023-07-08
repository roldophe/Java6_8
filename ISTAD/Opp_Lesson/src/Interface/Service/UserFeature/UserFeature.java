package Interface.Service.UserFeature;

import Interface.Service.UserService;

public class UserFeature {
    private UserService userService;
    public UserFeature(UserService userService){
        this.userService = userService;
    }

    void login(){
        userService.login();
    }
    void logout(){
        userService.logout();
    }
    void loginWithGoogle(){
        userService.loginWithGoogle();
    }
    void loginWithFacebook(){
        userService.loginWithFacebook();
    }
}

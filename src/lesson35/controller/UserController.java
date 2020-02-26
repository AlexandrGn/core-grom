package lesson35.controller;

import lesson35.model.User;
import lesson35.service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public void login(String userName, String password) throws Exception {
        userService.login(userName, password);
    }

    public void logout() {
        userService.logout();
    }

    public User registerUser(User user) throws Exception {
        return userService.registerUser(user);
    }

}

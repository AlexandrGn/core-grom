package lesson35.demo;

import lesson35.controller.UserController;
import lesson35.model.User;
import lesson35.model.UserNow;
import lesson35.model.UserType;

public class UserDemo {
    public static void main(String[] args) throws Exception {
        UserController userController=new UserController();
        userController.login("Gonchar","parol1");

        userController.logout();
        System.out.println(UserNow.getUserNow());

        userController.login("Gonchar","parol1");

//        System.out.println(userController.registerUser(new User("Oleksander","par","India", UserType.USER)));
        System.out.println(userController.registerUser(new User("Oleg55","par","India", UserType.USER)));


    }
}

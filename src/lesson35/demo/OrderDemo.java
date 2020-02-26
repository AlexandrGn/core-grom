package lesson35.demo;

import lesson35.controller.OrderController;
import lesson35.controller.UserController;

public class OrderDemo {
    public static void main(String[] args) throws Exception {
        UserController userController=new UserController();
        OrderController orderController=new OrderController();
        userController.login("Gonchar","parol1");

//        orderController.bookRoom(55555,55555,555555);
        orderController.bookRoom(65,2013,555);
//        orderController.cancelReservation(65,2013);

    }
}

package lesson35.demo;

import lesson35.DAO.DAO;
import lesson35.DAO.HotelDAO;
import lesson35.controller.HotelController;
import lesson35.controller.OrderController;
import lesson35.controller.RoomController;
import lesson35.controller.UserController;
import lesson35.model.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        UserController userController=new UserController();
        HotelController hotelController=new HotelController();
        RoomController roomController=new RoomController();
        OrderController orderController=new OrderController();

        userController.login("Gonchar","parol1");

        System.out.println(hotelController.findHotelByCity("Kiev"));







    }


}

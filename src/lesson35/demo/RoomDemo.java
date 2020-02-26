package lesson35.demo;

import lesson35.controller.HotelController;
import lesson35.controller.RoomController;
import lesson35.controller.UserController;
import lesson35.model.Filter;
import lesson35.model.Hotel;
import lesson35.model.Room;

import java.util.ArrayList;
import java.util.Date;

public class RoomDemo {
    public static void main(String[] args) throws Exception {
        UserController userController = new UserController();
        RoomController roomController = new RoomController();
        HotelController hotelController = new HotelController();

        userController.login("Gonchar", "parol1");


        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.addAll(hotelController.findHotelByName("HotelName8"));

        Room room = new Room(5, 1000, true, false, new Date(), hotels.get(0));
//        System.out.println(roomController.addRoom(room));
        roomController.deleteRoom(5888888);


        Filter filter = new Filter(5,1000,true,true,new Date(),"UKR","Kiev");

        for(Room room1: roomController.findRooms(filter)){
            System.out.println(room1);
        }


    }
}

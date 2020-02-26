package lesson35.demo;

import lesson35.controller.HotelController;
import lesson35.controller.UserController;
import lesson35.model.Hotel;

import java.util.ArrayList;

public class HotelDemo {
    public static void main(String[] args) throws Exception {
        UserController userController=new UserController();
        HotelController hotelController=new HotelController();

        userController.login("Gonchar","parol1");

        System.out.println("------------------------hotelController.findHotelByCity-----------------");
        System.out.println(hotelController.findHotelByCity("Kiev"));
        System.out.println(hotelController.findHotelByCity("London"));
        System.out.println(hotelController.findHotelByCity("NoName"));

        System.out.println("------------------------hotelController.findHotelByName-----------------");
        System.out.println(hotelController.findHotelByName("HotelName8"));
        System.out.println(hotelController.findHotelByName("HotelName1"));
        System.out.println(hotelController.findHotelByName("NoName"));

        System.out.println("------------------------hotelController.addAll-----------------");
        Hotel newHotel=new Hotel("Kleopatra55","Ukraine","Kametets","centralStreet");
        System.out.println(hotelController.addHotel(newHotel));
        ArrayList<Hotel> hotels=new ArrayList<>();
        hotels.addAll(hotelController.findHotelByName("HotelName"));

        //ошибка, так и должно быть
//        System.out.println(hotelController.addHotel(hotels.get(0)));

        System.out.println("------------------------hotelController.deleteHotel-----------------");
        hotelController.deleteHotel(1557242839119L);
        hotelController.deleteHotel(56565656);
    }
}

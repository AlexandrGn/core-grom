package lesson35.controller;

import lesson35.model.Hotel;
import lesson35.model.UserNow;
import lesson35.model.UserType;
import lesson35.service.HotelService;

import java.util.Set;

public class HotelController {
    private HotelService hotelService = new HotelService();
    private Controller controller = new Controller();

    public Set findHotelByName(String name) throws Exception {
        controller.validateUSER_Access();
        return hotelService.findHotelByName(name);
    }

    public Set findHotelByCity(String city) throws Exception {
        controller.validateUSER_Access();
        return hotelService.findHotelByCity(city);
    }

    public Hotel addHotel(Hotel hotel) throws Exception {
        controller.validateADMIN_Access();
        return hotelService.addHotel(hotel);
    }

    public void deleteHotel(long hotelId) throws Exception {
        controller.validateADMIN_Access();
        hotelService.deleteHotel(hotelId);
    }

}

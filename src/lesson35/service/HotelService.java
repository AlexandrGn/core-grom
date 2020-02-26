package lesson35.service;

import lesson35.DAO.HotelDAO;
import lesson35.model.Hotel;

import java.util.Set;

public class HotelService {
    private HotelDAO hotelDAO = new HotelDAO();

    public Set findHotelByName(String name) throws Exception {
        return hotelDAO.findHotelByName(name);
    }

    public Set findHotelByCity(String city) throws Exception {
        return hotelDAO.findHotelByCity(city);
    }

    public Hotel addHotel(Hotel hotel) throws Exception {
        return hotelDAO.add(hotel);
    }

    public void deleteHotel(long hotelId) throws Exception {
        hotelDAO.delete(hotelId);
    }
}

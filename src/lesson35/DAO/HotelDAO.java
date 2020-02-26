package lesson35.DAO;

import lesson35.exceptions.InvalidInput;
import lesson35.model.Hotel;

import java.util.HashSet;
import java.util.Set;

public class HotelDAO extends DAO<Hotel> {

    {
        String path = "D:\\JAVA\\файли до 35-36 уроків громкод\\HotelDb.txt";
        setPath(path);
    }

    public Set<Hotel> findHotelByName(String name) throws Exception {
        Set<Hotel> hotelSet = new HashSet<>();
        for (Hotel hotel : getAll()) {
            if (hotel.getName().equals(name))
                hotelSet.add(hotel);
        }

        return hotelSet;
    }

    public Set<Hotel> findHotelByCity(String city) throws Exception {
        Set<Hotel> hotelSet = new HashSet<>();
        for (Hotel hotel : getAll()) {
            if (hotel.getCity().equals(city))
                hotelSet.add(hotel);
        }

        return hotelSet;
    }

    @Override
    public Hotel mapObject(String line) {
        String[] arrayData = line.split(",");
        return new Hotel(Long.parseLong(arrayData[0]), arrayData[1], arrayData[2], arrayData[3], arrayData[4]);
    }
}

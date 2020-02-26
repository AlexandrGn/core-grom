package lesson35.DAO;

import lesson35.exceptions.FileInvalidException;
import lesson35.model.Filter;
import lesson35.model.Hotel;
import lesson35.model.IdEntity;
import lesson35.model.Room;

import java.util.HashSet;
import java.util.Set;

public class RoomDao extends DAO<Room> {
    private HotelDAO hotelDAO = new HotelDAO();

    {
        String path = "D:\\JAVA\\файли до 35-36 уроків громкод\\RoomDb.txt";
        setPath(path);
    }

    public Set<Room> findRooms(Filter filter) throws Exception {
        Set<Room> rooms = new HashSet<>();

        for (Room room : getAll()) {
            if (room.getNumberOfGuests() == filter.getNumberOfGuests() &&
                    room.getPrice() == filter.getPrice() &&
                    room.isBreakfastIncluded() == filter.isBreakfastIncluded() &&
                    room.isPetsAllowed() == filter.isPetsAllowed() &&
                    IdEntity.equalsDate(room.getDateAvailableFrom(), filter.getDateAvailableFrom()) &&
                    room.getHotel().getCountry().equals(filter.getCountry()) &&
                    room.getHotel().getCity().equals(filter.getCity())) {

                rooms.add(room);
            }
        }

        return rooms;
    }

    @Override
    public Room mapObject(String line) throws Exception {
        String[] arrayData = line.split(",");
        Hotel hotel = hotelDAO.findById(Long.parseLong(arrayData[6]));
        return new Room(Long.parseLong(arrayData[0]), Integer.parseInt(arrayData[1]), Double.parseDouble(arrayData[2]),
                Boolean.parseBoolean(arrayData[3]), Boolean.parseBoolean(arrayData[4]), toDateFormat(arrayData[5]), hotel);
    }
}

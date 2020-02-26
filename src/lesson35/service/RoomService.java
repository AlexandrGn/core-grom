package lesson35.service;

import lesson35.DAO.RoomDao;
import lesson35.model.Filter;
import lesson35.model.Room;

import java.util.Set;

public class RoomService {

    private RoomDao roomDao = new RoomDao();

    public Room addRoom(Room room) throws Exception {
        return roomDao.add(room);
    }

    public void deleteRoom(long roomId) throws Exception {
        roomDao.delete(roomId);
    }

    public Set<Room> findRooms(Filter filter) throws Exception {
        return roomDao.findRooms(filter);
    }
}

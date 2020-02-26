package lesson35.controller;

import lesson35.model.Filter;
import lesson35.model.Room;
import lesson35.service.RoomService;

import java.util.Set;

public class RoomController {
    private RoomService roomService = new RoomService();
    private Controller controller = new Controller();

    public Room addRoom(Room room) throws Exception {
        controller.validateADMIN_Access();
        return roomService.addRoom(room);
    }

    public void deleteRoom(long roomId) throws Exception {
        controller.validateADMIN_Access();
        roomService.deleteRoom(roomId);
    }

    public Set<Room> findRooms(Filter filter) throws Exception {
        controller.validateUSER_Access();
        return roomService.findRooms(filter);
    }


}

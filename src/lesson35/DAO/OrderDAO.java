package lesson35.DAO;

import lesson35.exceptions.BadRequestException;
import lesson35.model.Order;
import lesson35.model.Room;
import lesson35.model.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OrderDAO extends DAO<Order> {
    private RoomDao roomDAO = new RoomDao();
    private UserDAO userDAO = new UserDAO();

    {
        String path = "D:\\JAVA\\файли до 35-36 уроків громкод\\OrderDb.txt";
        setPath(path);
    }

    public void bookRoom(long roomId, long userId, long hotelId) throws Exception {
        User userOrder = userDAO.findById(userId);
        Room roomOrder = roomDAO.findById(roomId);
        if (userOrder == null)
            throw new BadRequestException("there is no user with this id=" + userId + " class OrderDAO, metod bookRoom");
        if (roomOrder == null)
            throw new BadRequestException("there is no room with this id=" + roomId + " class OrderDAO, metod bookRoom");

        Order order = new Order(userOrder, roomOrder, new Date(), new Date(), 105.36);
        add(order);
    }

    public void cancelReservation(long roomId, long userId) throws Exception {
        for (Order order : getAll())
            if (order.getRoom().getId() == roomId && order.getUser().getId() == userId)
                delete(order.getId());
    }

    @Override
    public Order mapObject(String line) throws Exception {
        String[] arrayData = line.split(",");
        User user = userDAO.findById(Long.parseLong(arrayData[1]));
        Room room = roomDAO.findById(Long.parseLong(arrayData[2]));
        return new Order(Long.parseLong(arrayData[0]), user, room, toDateFormat(arrayData[3]),
                toDateFormat(arrayData[4]), Double.parseDouble(arrayData[5]));
    }
}

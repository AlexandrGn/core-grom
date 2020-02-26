package lesson35.service;

import lesson35.DAO.OrderDAO;

public class OrderService {
    private OrderDAO orderDAO = new OrderDAO();

    public void bookRoom(long roomId, long userId, long hotelId) throws Exception {
        orderDAO.bookRoom(roomId, userId, hotelId);
    }

    public void cancelReservation(long roomId, long userId) throws Exception {
        orderDAO.cancelReservation(roomId, userId);
    }
}

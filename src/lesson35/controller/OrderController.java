package lesson35.controller;

import lesson35.service.OrderService;

public class OrderController {
    private OrderService orderService = new OrderService();
    private Controller controller = new Controller();

    public void bookRoom(long roomId, long userId, long hotelId) throws Exception {
        controller.validateUSER_Access();
        orderService.bookRoom(roomId, userId, hotelId);
    }

    public void cancelReservation(long roomId, long userId) throws Exception {
        controller.validateUSER_Access();
        orderService.cancelReservation(roomId, userId);
    }

}

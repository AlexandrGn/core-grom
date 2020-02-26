package lesson1_33.lesson7;

import java.util.Date;
import lesson1_33.lesson6.Order;

public class DemoHomeWork {



    Order createOrder() {
        return new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    Order createOrderAndCallMethods() {
        Order order = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");

        order.checkPrice();
        order.isValidType();
        order.confirmOrder();

        return order;
    }

}

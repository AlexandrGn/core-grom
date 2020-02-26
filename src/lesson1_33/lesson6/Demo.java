package lesson1_33.lesson6;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Order order = new Order(500, new Date(), true, new Date(), "kiev", "UK", "A");
        demoD(order);

        Order order1 = new Order(5000, new Date(), false, new Date(), "kiev", "UK", "Buy");
        demoD(order1);

        Order order2 = new Order(-500, new Date(), true, new Date(2008), "kiev", "UK", "Sale");
        demoD(order2);

        Order order3 = new Order(1000, new Date(), false, new Date(2008), "kiev", "UK", "Buyf");
        demoD(order3);

        Order order4 = new Order(999, new Date(), true, new Date(), "kiev", "UK", "A");
        demoD(order4);

        Order order5 = new Order(1001, new Date(), true, new Date(), "kiev", "UK", "A");
        demoD(order5);


    }
    static void demoD(Order order){
        System.out.println(order.toString());
        order.confirmOrder();
        System.out.println(order.dateConfirmed);
        System.out.println(order.checkPrice());
        System.out.println(order.isValidType());
        System.out.println(order.toString());
        System.out.println("---------------------");
    }
}

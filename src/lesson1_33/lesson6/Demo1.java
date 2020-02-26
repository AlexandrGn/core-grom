package lesson1_33.lesson6;

import java.util.Date;

public class Demo1 {

    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");
        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);

        System.out.println(carObject.ownerName);
        
        carObject.horsePower=100;
        
        System.out.println(carObject.horsePower);
        
        carObject.startRun();
        carObject.stopRun();
        
        carObject.changeOwner("Test");
        
        System.out.println(carObject.ownerName);
        
        Car carObject2=null;
        
        System.out.println(carObject2);
    }
    
//    Order createOrderAndCallMethods() {
//        Order order = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
//        
//        order.checkPrice();
//        order.isValidType();
//        order.confirmOrder();
//        
//        return order;
//        
//    }

}

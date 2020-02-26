package lesson1_33.lesson7;

import lesson1_33.lesson6.Car;
import lesson1_33.lesson6.DbConnector;
import lesson1_33.lesson6.Order;
import lesson1_33.lesson6.User;

public class Demo {

    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Jack");

        Car car = new Car(10000, 2015, "Anton");

        DbConnector dbConnector = new DbConnector();


        //Перевірка ДЗ////////////////
        System.out.println("---------------------");
        DemoHomeWork demoHomeWork= new DemoHomeWork();
        System.out.println(demoHomeWork.createOrder().toString());
        System.out.println(demoHomeWork.createOrderAndCallMethods().toString());
    }

}

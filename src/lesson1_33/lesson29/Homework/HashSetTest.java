package lesson1_33.lesson29.Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        useHashSet();
    }

    public static void useHashSet(){
        HashSet<Order> orders=new HashSet<>();
        HashSet<Order> orders1=new HashSet<>();


        Order order1=new Order(101,1000,"as","sdf","sdf");
        Order order2=new Order(101,1000,"as","sdf","sdf");
        Order order3=new Order(103,1000,"as","sdf","sdf");
        Order order4=new Order(104,1000,"as","sdf","sdf");
        Order order5=new Order(105,1000,"as","sdf","sdf");
        Order order6=new Order(106,1000,"as","sdf","sdf");
        Order order7=new Order(107,100,"as","sdf","sdf");
        Order order8=new Order(108,100,"as","sdf","sdf");

        System.out.println(orders);
        orders.add(order1);
        orders.add(order1);
        orders.add(order2);
        System.out.println(orders);

        orders.add(order3);
        orders.add(order4);
        System.out.println(orders);

        orders.remove(order2);
        System.out.println(orders);

        orders1.add(order1);
        orders1.add(order7);
        orders1.add(order8);
        orders1.add(order4);

        orders.retainAll(orders1);

        System.out.println(Arrays.toString(orders.toArray()));
        System.out.println(orders1.size());

        orders.addAll(orders1);
        System.out.println(orders);
        orders.add(order6);

        Iterator<Order> orderIterator=orders.iterator();
        while (orderIterator.hasNext())
            orders1.remove(orderIterator.next());

        System.out.println(orders1);
    }
}

package lesson1_33.lesson27.LinkedListWork;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println(useList().toString());
    }


    public static LinkedList<Order>  useList(){
        LinkedList<Order> orders=new LinkedList<>();
        LinkedList<Order> orders1=new LinkedList<>();


        Order order1=new Order(101,200,"hjk","hjk","k");
        Order order2=new Order(1023,200,"hjk","hjk","k");
        Order order3=new Order(1023,200,"hjk","hjk","k");
        Order order4=new Order(104,200,"hjk","hjk","k");
        Order order5=new Order(105,10,"hjk","hjk","k");
        Order order6=new Order(106,0,"hjk","hjk","k");
        Order order7=new Order(107,100,"hjk","hjk","k");
        Order order8=new Order(108,230,"hjk","hjk","k");
        Order order9=new Order(109,250,"hjk","hjk","k");
        Order order10=new Order(110,2000,"hjk","hjk","k");

        orders.add(order1);
        orders.add(order1);
        orders.add(order2);

        System.out.println(orders.toString());

        orders.remove(order1);
        orders.remove(order3);
        orders.remove(order2);
        orders.remove(null);

        orders.add(0,order4);
        orders.add(2,order5);

        orders.remove(0);
        System.out.println(orders.toString());

        orders1.add(order9);
        orders1.add(1,order10);

        orders.addAll(orders1);

        System.out.println(orders.subList(1,3));
        orders.set(2,order7);

        System.out.println(orders.contains(order1));
        System.out.println(orders.contains(order6));

        System.out.println(Arrays.toString(orders.toArray()));

        orders1.clear();
        System.out.println(orders1.toString());



        return orders;
    }
}

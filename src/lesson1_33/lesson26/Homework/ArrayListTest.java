package lesson1_33.lesson26.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println(useList().toString());
    }

    public static ArrayList useList() {
        ArrayList<Order> orderArrayList = new ArrayList<>();

        Order order1=new Order(101,1000,"cur1","IN1","shop1");
        Order order2=new Order(101,1000,"cur1","IN1","shop1");



        orderArrayList.add(0,order1);
        orderArrayList.add(null);
        orderArrayList.add(null);

        orderArrayList.remove(1);
        orderArrayList.remove(null);

        orderArrayList.remove(order2);
        orderArrayList.remove(order1);
        orderArrayList.add(order1);
        orderArrayList.add(order1);
        orderArrayList.add(order2);
        orderArrayList.remove(order1);
        orderArrayList.remove(order1);
        orderArrayList.remove(order1);


        orderArrayList.addAll(new ArrayList<>());

        ArrayList<Order> orderArrayList2 = new ArrayList<>();

        orderArrayList2.add(new Order(103,500,"cur2","IN2","d"));
        orderArrayList2.addAll(orderArrayList);


        System.out.println(orderArrayList.toString());
        System.out.println(orderArrayList2.toString());


        orderArrayList2.set(0,new Order(110,50,null,"",""));

        System.out.println(orderArrayList2.toString());

        System.out.println(orderArrayList2.subList(0,1).toString());

        System.out.println(Arrays.toString(orderArrayList2.toArray()));
        orderArrayList.clear();
        System.out.println(orderArrayList.toString());

        System.out.println(orderArrayList.contains(order1));

        orderArrayList2.add(new Order(502,1000,"d","d","d"));
        orderArrayList2.add(new Order(510,1000,"d","d","d"));
        orderArrayList2.add(new Order(555,1000,"d","d","d"));

        return orderArrayList2;

    }
}
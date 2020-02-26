package lesson1_33.lesson26;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        int[] test = new int[5];
        test[0] = 10;

        int[] test1 = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(7);
        System.out.println(list.toString());

        list.remove(1);
        list.remove(new Integer(11));
        System.out.println(list.toString());

        System.out.println(list.get(0));

        list.add(5);
        list.add(7);
        list.add(35);
        System.out.println(list.toString());

        list.add(2, 33);
        System.out.println(list.toString());

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.addAll(list);
        list.remove(0);
        System.out.println(list.toString());
        System.out.println(list1.toString());

        list.set(3, 5555);
        System.out.println(list.toString());

    }
}
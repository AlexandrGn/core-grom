package lesson1_33.lesson27;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TestPerformance {
    public static void main(String[] args) {
        System.out.println((50-50%2)/2);
        System.out.println((51-51%2)/2);
        testAddMethod();
//        testRemoveMethod();
//        testGetMethod();
    }

    private static void testAddMethod() {
        ArrayList<String> arrayList = new ArrayList<>();

        Date start = new Date();

        for (int i = 0; i < 100_00; i++) {
            int b=(i-i%2)/2;
            arrayList.add(0,String.valueOf(i));
//            arrayList.add(i, String.valueOf(i));
        }

        Date finish = new Date();

        System.out.println("arrayList.add: " + (finish.getTime() - start.getTime()));


        LinkedList<String> linkedList = new LinkedList<>();

        Date start2 = new Date();

        for (int i = 0; i < 100_00; i++) {
            linkedList.add((i-i%2)/2,String.valueOf(i));
//            linkedList.add(i, String.valueOf(i));
        }

        Date finish2 = new Date();

        System.out.println("LinkedList.add: " + (finish2.getTime() - start2.getTime()));
    }

    private static void testRemoveMethod() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i, String.valueOf(i));
        }

        Date start = new Date();
        for (int i = 0; i < 90_000; i++) {
            arrayList.remove(10000);
        }
        Date finish = new Date();

        System.out.println("arrayList.remove: " + (finish.getTime() - start.getTime()));


        LinkedList<String> LinkedList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            LinkedList.add(i, String.valueOf(i));
        }

        Date start2 = new Date();
        for (int i = 0; i < 90_000; i++) {
            LinkedList.remove(10000);
        }
        Date finish2 = new Date();

        System.out.println("LinkedList.remove: " + (finish2.getTime() - start2.getTime()));
    }

    private static void testGetMethod() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i, String.valueOf(i));
        }

        Date start = new Date();
        for (int i = 0; i < 100_000; i++) {
            arrayList.get(50000);
        }
        Date finish = new Date();

        System.out.println("arrayList.get: " + (finish.getTime() - start.getTime()));


        LinkedList<String> LinkedList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            LinkedList.add(i, String.valueOf(i));
        }

        Date start2 = new Date();
        for (int i = 0; i < 100_000; i++) {
            LinkedList.get(50000);
        }
        Date finish2 = new Date();

        System.out.println("LinkedList.get: " + (finish2.getTime() - start2.getTime()));
    }
}

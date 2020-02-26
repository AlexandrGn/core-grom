package lesson1_33.lesson5;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        //ArraysPractice maxElement
//        System.out.println("    "+ "ArraysPractice maxElement");
//        //System.out.println(ArraysPractice.maxElement(null)); //помилка
//        //System.out.println(ArraysPractice.maxElement(new int[]{})); //помилка
//        System.out.println(ArraysPractice.maxElement(new int[]{0}));
//
//        //ArraysPractice nCount
//        System.out.println("    "+ "ArraysPractice nCount");
//        //System.out.println(ArraysPractice.nCount(null,0));//помилка
//        System.out.println(ArraysPractice.nCount(new int[]{},0));
//        System.out.println(ArraysPractice.nCount(new int[]{2,3},2));
//
//        //УникальныеЭлементы uniqueCount
//        System.out.println("    "+ "УникальныеЭлементы uniqueCount");
//        //System.out.println(УникальныеЭлементы.uniqueCount(null));//помилка
//        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{}));
//        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{0}));
//        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{1,2,1}));
//
//        //SortArray minusArray
//        System.out.println("    "+ "SortArray minusArray");
//        System.out.println();


        //SortArray sortAscending
        System.out.println("    "+ "SortArray sortAscending");
        System.out.println(Arrays.toString(SortArray.sortAscending(new int[]{2,6,9,0,-6,-2,8,0})));
        int[] array=null;
        System.out.println(Arrays.toString(SortArray.sortAscending(array)));
        System.out.println(Arrays.toString(SortArray.sortAscending(new int[]{})));
        System.out.println(Arrays.toString(SortArray.sortAscending(new int[]{5,5,5,5})));

        //SortArray sortDescending
        System.out.println("    "+ "SortArray sortDescending");
        System.out.println(Arrays.toString(SortArray.sortDescending(new int[]{2,6,9,0,-6,-2,8,0})));
        int[] array1=null;
        System.out.println(Arrays.toString(SortArray.sortDescending(array1)));
        System.out.println(Arrays.toString(SortArray.sortDescending(new int[]{})));
        System.out.println(Arrays.toString(SortArray.sortDescending(new int[]{5,5,5,5})));

        //BanksPractice withdraw
        System.out.println("    "+ "BanksPractice withdraw");
        String names[] = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        System.out.println(BanksPractice.findClientIndexByName(names,"Annd"));
        BanksPractice.depositMoney(names,balances,"eewfwef",50);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(balances));
        System.out.println(BanksPractice.withdraw(names,balances,"Ann",600));
        System.out.println(BanksPractice.withdraw(names,balances,"Anndvgsdgsg",600));
        System.out.println(BanksPractice.withdraw(names,balances,"Ann",450));
        System.out.println(BanksPractice.withdraw(names,balances,"Ann",500));
        System.out.println(BanksPractice.withdraw(names,balances,"Irina",100));
        System.out.println(BanksPractice.withdraw(names,balances,"Ann",-50));

        //УникальныеЭлементы uniqueCount
        System.out.println("    "+ "УникальныеЭлементы uniqueCount");
        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{2,6,9,8,7,2,3,3,9}));
        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{0,0,0,0}));
        System.out.println(УникальныеЭлементы.uniqueCount(new int[]{-5,-5,5,-5,0}));

    }
}

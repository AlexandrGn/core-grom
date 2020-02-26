package lesson1_33.lesson18.Homework;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findNumbers(null)));
        System.out.println(Arrays.toString(findNumbers0("")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0(" ")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("     ")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("sa")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("55")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("5a df")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("56 65 523.5")));
        System.out.println("----------------");
        System.out.println(Arrays.toString(findNumbers0("   56   36  fff ")));
        System.out.println("----------------");
    }

    public static int[] findNumbers(String text) {
        String[] words = text.split(" ");

        int countNumber = 0;

        for (String s : words) {
            try {
                Integer.parseInt(s);
                countNumber++;
            } catch (Exception e) {
            }
        }

        int index = 0;
        int[] number = new int[countNumber];
        for (String s : words) {
            try {
                if (!s.isEmpty()) number[index++] = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("not a number");
            }
        }
        return number;
    }

    public static int[] findNumbers0(String text) {
        String[] words = text.split(" ");

        int countNumber = 0;

        for (String s : words)
            if (wordNumber(s)) countNumber++;

        int index = 0;
        int[] number = new int[countNumber];

        for (String s : words)
            if (wordNumber(s)) number[index++] = Integer.parseInt(s);

        return number;
    }


    private static boolean wordNumber(String word) {
        if (word.isEmpty()) return false;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

}

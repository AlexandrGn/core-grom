package lesson1_33.lesson32.Homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static int readNumbers() throws Exception {
        int n = 3;
        int[] numbers = new int[10];


        while (n > 0) {
            n--;

            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);

            String text = br.readLine();
            String[] array = text.split(" ");

            try {
                if (array.length != 10)
                    throw new Exception();

                for (int i = 0; i < array.length; i++)
                    numbers[i] = Integer.parseInt(array[i]);

                for (int number : numbers) {
                    if (number < 0 || number > 100)
                        throw new Exception();
                }
                break;
            } catch (Exception e) {
                if (n == 0) {
                    System.out.println("Your numbers are wrong. Number of attempts exceeded");
                    throw new Exception();
                }
                System.out.println("Your numbers are wrong. You have " + n + " attempts to try again");
            }
        }

        int summa = 0;
        for (int number : numbers) {
            summa += number;
        }

        return summa;
    }
}



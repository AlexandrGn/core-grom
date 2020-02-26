package lesson1_33.lesson5;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int array[] = {-10, 10, -10};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int[] sortAscending(int array[]) {
        if (array==null) return (new int[]{});
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }

        }
        return array;
    }

    public static int[] sortDescending(int array[]) {
        if (array==null) return (new int[]{});
        array = sortAscending(array);
        int n=array.length;
        int[] array2=new int[n];
        for(int i=0;i<n;i++){
            array2[n-1-i]=array[i];
        }
        return array2;
    }
//
//    public static void minusArray(int array[]) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = -array[i];
//        }
//
//    }

}

package lesson1_33.lesson5;

import java.util.Arrays;

public class УникальныеЭлементы {
    
    
    public static void main(String[] args) {
        int array[]={11,11,12};
        System.out.println(uniqueCount(array));
    }
    
    public static int uniqueCount(int[] array){
        int n,m=0;
        for(int i=0; i< array.length;i++){
            n=1;
            for(int j=0;j<i;j++){
                if (array[i]==array[j]) n=0;
            }
            if (n==1) m++;
            }
        
        return m;
    }
}

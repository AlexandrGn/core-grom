package lesson1_33.lesson4;

public class Example2 {
    
    public static int findDivCount(short a, short b, int n){
        if (n==0) return 0;
        int m=0;
        for (int i=a;i<=b;i++){
            if(i%n==0) m++;
        }
        return m;
    }
}

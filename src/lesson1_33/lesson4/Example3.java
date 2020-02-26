
package lesson1_33.lesson4;

public class Example3 {
    public static boolean compareSums(int a,int b,int c, int d){
        return (sum(a,b)>sum(c,d));
    }
    
    public static long sum(int from,int to){
        long s=0;
        for (long i=from;i<=to;i++) s+=i;
        return s;
    }
}

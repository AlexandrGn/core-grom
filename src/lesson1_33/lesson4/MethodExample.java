package lesson1_33.lesson4;

public class MethodExample {
    
    public static void main(String[] args) {
        System.out.println(increaser(5,20));
        System.out.println(min(increaser(5,20),11));
    }

    public static int increaser(int a, int index) {
        System.out.println("method invoked");
        System.out.println("method before return");
        return a += index;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;

    }
}

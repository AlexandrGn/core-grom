package lesson1_33.lesson8.massiv;

public class Demo {

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(5, 3));
        int d[]=new int[3];
        d[0]= 5;
        d[1]=8;
        d[2]=120 ;
        System.out.println(adder.check(d));

    }
}

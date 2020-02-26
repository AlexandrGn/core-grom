package lesson1_33.lesson8;

import lesson1_33.lesson8.massiv.Adder;
import lesson1_33.lesson8.massiv.Arithmetic;
import lesson1_33.lesson8.studentExample.Student;

public class Demo {
    public static void main(String[] args) {

        //massiv.Arithmetic.check
        System.out.println("    " + "massiv.Arithmetic.check");
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.check(new int[]{2, -9, 10, 0, 10, 19}));
        System.out.println(arithmetic.check(new int[]{2, -9, 10, 0, 10, 250}));
        System.out.println(arithmetic.check(new int[]{}));
        System.out.println(arithmetic.check(new int[]{50}));
        System.out.println(arithmetic.check(null));

        //massiv.Adder.add
        System.out.println("    " + "massiv.Adder.add");
        Adder adder1 = new Adder();
        System.out.println(adder1.add(1, 3));
        System.out.println(adder1.add(1, -1));
        System.out.println(adder1.check(new int[]{5, 6, 120}));

        //studentExample.Demo
        System.out.println("    " + "studentExample.Demo.createHighestParent");
        lesson1_33.lesson8.studentExample.Demo demo = new lesson1_33.lesson8.studentExample.Demo();
        Student student1= demo.createHighestParent();
        Student student2= demo.createLowestChild();
        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}

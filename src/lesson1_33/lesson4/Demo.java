package lesson1_33.lesson4;

public class Demo {
    public static void main(String[] args) {
        //Example1 concat
        System.out.println("    "+ "Example1 concat");
        System.out.println(Example1.concat("","",""));
        System.out.println(Example1.concat(null,"a",null));
        System.out.println(Example1.concat(null,"a",""));
        System.out.println(Example1.concat(null,null,null));

        //Example2 findDivCount
        System.out.println("    "+ "Example2 findDivCount");
        System.out.println(Example2.findDivCount((short)(5),(short)(5),3));
        System.out.println(Example2.findDivCount((short)(5),(short)(5),5));
        System.out.println(Example2.findDivCount((short)(5),(short)(2),3));
        System.out.println(Example2.findDivCount((short)(-5),(short)(-5),5));
        System.out.println(Example2.findDivCount((short)(-5),(short)(5),5));
        System.out.println(Example2.findDivCount((short)(2),(short)(2),0)); //помилка, виправлено

        //Example3 sum
        System.out.println("    "+ "Example3 sum");
        System.out.println(Example3.sum(2,10));
        System.out.println(Example3.sum(20,10));
        System.out.println(Example3.sum(-2,2));
        System.out.println(Example3.sum(10,10));
        System.out.println(Example3.sum(0,0));
        System.out.println(Example3.sum(0,-1));

        //Example3 compareSums
        System.out.println("    "+ "Example3 compareSums");
        System.out.println(Example3.compareSums(2,3,4,5));
        System.out.println(Example3.compareSums(2,3,2,3));
        System.out.println(Example3.compareSums(0,0,2,2));







        //MethodExample min
        System.out.println("    "+ "MethodExample min");
        System.out.println(MethodExample.min(2,2));
        System.out.println(MethodExample.min(2,10));
        System.out.println(MethodExample.min(0,0));
        System.out.println(MethodExample.min(-2,2));

        //MethodExample increaser
        System.out.println("    "+ "MethodExample increaser");
        System.out.println(MethodExample.increaser(2,3));
        System.out.println(MethodExample.increaser(2,0));

        //PracticeExample min
        System.out.println("    "+ "PracticeExample min");
        System.out.println(PracticeExample.min(0,0,0));
        System.out.println(PracticeExample.min(0,1,2));
        System.out.println(PracticeExample.min(0,-1,0));
        System.out.println(PracticeExample.min(3,2,1));
        System.out.println(PracticeExample.min(1,3,2));
        System.out.println(PracticeExample.min(2,3,1));
        System.out.println(PracticeExample.min(2,1,3));
        System.out.println(PracticeExample.min(3,1,2));

        //PracticeExample average()
        System.out.println("    "+ "PracticeExample average()");
        System.out.println(PracticeExample.average(0));
        System.out.println(PracticeExample.average(5));
        System.out.println(PracticeExample.average(10));
        System.out.println(PracticeExample.average(-10));

        //PracticeExample average(,)
        System.out.println("    "+ "PracticeExample average(,)");
        System.out.println(PracticeExample.average(0,0));
        System.out.println(PracticeExample.average(0,5));
        System.out.println(PracticeExample.average(5,0));
        System.out.println(PracticeExample.average(-5,0));
        System.out.println(PracticeExample.average(0,-5));
        System.out.println(PracticeExample.average(-5,-5));
        System.out.println(PracticeExample.average(5,5));
        System.out.println(PracticeExample.average(1,2));
        System.out.println(PracticeExample.average(2,1));
        System.out.println(PracticeExample.average(-2,-1));
        System.out.println(PracticeExample.average(-1,-2));
        System.out.println(PracticeExample.average(2,-1));
        System.out.println(PracticeExample.average(-1,2));

        //PracticeExample count
        System.out.println("    "+ "PracticeExample count");
        System.out.println(PracticeExample.count(2,3,0));
        System.out.println(PracticeExample.count(5,3,0));
        System.out.println(PracticeExample.count(2,3,-2));
        System.out.println(PracticeExample.count(2,8,3));
    }


}

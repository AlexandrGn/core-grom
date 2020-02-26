package lesson1_33.test_logica;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        FormulaElementary f1 = new FormulaElementary("f1");
        FormulaElementary f2 = new FormulaElementary("f2");
        FormulaImplication ff1 = new FormulaImplication(f1, f2);
        FormulaImplication ff2 = new FormulaImplication(ff1, ff1);
        FormulaNegative g1 = new FormulaNegative(ff1);
        Formula ff3 = new FormulaImplication(ff1, g1);

        Formula a = Axioma.getAxiom2(ff1, new FormulaElementary("G"), new FormulaElementary("H"));
        Formula a2 = Axioma.getAxiom1(ff1, f1);

        Formula form= new FormulaImplication(ff3,new FormulaImplication(ff1,ff3));
        System.out.println(a);

        System.out.println(ff3 instanceof FormulaImplication);
        System.out.println(ff3 instanceof Formula);
        System.out.println("---------");
        System.out.println(test(2));
        System.out.println(test(0));
    }

    public static int test(int a){
        int f=-10;
        try {
            f=-5;
            return f=10/a;
        }catch (Exception e){
            f=-5;
            return f=0;
        }finally {
            System.out.println(f);
        }
    }
}

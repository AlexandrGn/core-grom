package lesson1_33.test_logica;

import java.util.Objects;
import java.util.TreeMap;

public class FormulaImplication extends Formula {
    private Formula f1;
    private Formula f2;

    public FormulaImplication(Formula f1, Formula f2) {
        super(f1.getCountFormulOsnov()+f2.getCountFormulOsnov(),
                Integer.max(f1.getDepthOfFormula(),f2.getDepthOfFormula())+1,
                f1.getElementaryFormulas(),f2.getElementaryFormulas());

        this.f1 = f1;
        this.f2 = f2;
    }

    public Formula getF1() {
        return f1;
    }

    public Formula getF2() {
        return f2;
    }

    @Override
    public Integer formulaValue01(TreeMap<String, Integer> map) {
        Integer vuluef1=f1.formulaValue01(map);
        if(vuluef1==0) return 1;
        return f1.formulaValue01(map)*(f2.formulaValue01(map)-1)+1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaImplication that = (FormulaImplication) o;
        return Objects.equals(f1, that.f1) &&
                Objects.equals(f2, that.f2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f1, f2);
    }

    @Override
    public String toString() {
        return "(" + f1 + "→" + f2 + ")";
    }
}

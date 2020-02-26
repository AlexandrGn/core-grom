package lesson1_33.test_logica;

import java.util.Objects;
import java.util.TreeMap;

public class FormulaNegative extends Formula {
    private Formula f;

    public FormulaNegative(Formula f) {
        super(f.getCountFormulOsnov(),f.getDepthOfFormula()+1,f.getElementaryFormulas());
        this.f = f;
    }

    public Formula getF() {
        return f;
    }

    @Override
    public Integer formulaValue01(TreeMap<String, Integer> map) {
        return 1-f.formulaValue01(map);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaNegative that = (FormulaNegative) o;
        return Objects.equals(f, that.f);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f);
    }

    @Override
    public String toString() {
        return "¬" + f;
    }

}

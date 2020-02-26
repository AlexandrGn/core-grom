package lesson1_33.test_logica;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

public class FormulaElementary extends Formula {
    private String f;

    public FormulaElementary(String f) {
        super(1,1, Arrays.asList(new String[]{f}));
        this.f = f;
    }

    public String getF() {
        return f;
    }

    @Override
    public Integer formulaValue01(TreeMap<String,Integer> map){
        return map.get(f);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaElementary that = (FormulaElementary) o;
        return Objects.equals(f, that.f);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f);
    }

    @Override
    public String toString() {
        return f;
    }
}

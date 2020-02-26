package lesson1_33.test_logica;

import java.util.ArrayDeque;

public class Axioma {

    public static Formula getAxiom1(Formula f, Formula g) {
        return new FormulaImplication(f, new FormulaImplication(g, f));
    }

    public static Formula getAxiom2(Formula f, Formula g, Formula h) {
        Formula f1 = new FormulaImplication(f, new FormulaImplication(g, h));
        Formula f2 = new FormulaImplication(new FormulaImplication(f, g), new FormulaImplication(f, h));
        return new FormulaImplication(f1, f2);
    }

    public static Formula getAxiom3(Formula f, Formula g) {
        Formula f1 = new FormulaImplication(new FormulaNegative(g), new FormulaNegative(f));
        Formula f2 = new FormulaImplication(new FormulaImplication(new FormulaNegative(g), f), g);
        return new FormulaImplication(f1, f2);
    }

    public static AxiomNumber axiomCheck(Formula formula) {

        try {
            if (formula.formulaCod("L").equals(formula.formulaCod("RR"))) {
                return AxiomNumber.AXIOM1;
            }
        } catch (NotEnoughDepthFormulaException e) {
        }

        try {
            if (formula.formulaCod("LL").equals(formula.formulaCod("RLL")) &&
                    formula.formulaCod("LL").equals(formula.formulaCod("RRL")) &&
                    formula.formulaCod("LRL").equals(formula.formulaCod("RLR")) &&
                    formula.formulaCod("LRR").equals(formula.formulaCod("RRR"))) {
                return AxiomNumber.AXIOM2;
            }
        } catch (NotEnoughDepthFormulaException e) {
        }

        try {
            if (formula.formulaCod("LLN").equals(formula.formulaCod("RLLN")) &&
                    formula.formulaCod("LLN").equals(formula.formulaCod("RR")) &&
                    formula.formulaCod("LRN").equals(formula.formulaCod("RLR"))) {
                return AxiomNumber.AXIOM3;
            }
        } catch (NotEnoughDepthFormulaException e) {
        }


        return AxiomNumber.NOAXIOM;
    }

    public static boolean checkModusPonens(Formula f1, Formula f2){
        if (f2 instanceof FormulaImplication && f1.equals(((FormulaImplication) f2).getF1())) return true;
        return false;
    }

    public static Formula modusPonens(Formula f1, Formula f2){
        if (!checkModusPonens(f1,f2)) return null;
        return ((FormulaImplication) f2).getF2();
    }
}

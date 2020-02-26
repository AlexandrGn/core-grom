package lesson1_33.test_logica;

import java.util.*;

public abstract class Formula {
    private int countFormulOsnov = 0;           //кількість елементраних формул в даній формулі
    private int depthOfFormula = 0;             //глубина формули (кількістьповерхів в дереві-графі)

    private HashSet<String> elementaryFormulas = new HashSet<>();

    private AxiomNumber axiomNumber;
    private Boolean teorema;


    public Formula(int countFormulOsnov, int depthOfFormula, Collection<String>... elementaryFormulas1) {
        this.countFormulOsnov = countFormulOsnov;
        this.depthOfFormula = depthOfFormula;
        for (Collection<String> col : elementaryFormulas1) {
            this.elementaryFormulas.addAll(col);
        }

    }

    public int getCountFormulOsnov() {
        return countFormulOsnov;
    }

    public int getDepthOfFormula() {
        return depthOfFormula;
    }

    public HashSet<String> getElementaryFormulas() {
        return elementaryFormulas;
    }

    public AxiomNumber getAxiomNumber() {
        if (axiomNumber == null) {
            axiomNumber = Axioma.axiomCheck(this);
            if (axiomNumber != AxiomNumber.NOAXIOM) teorema = true;
        }
        return axiomNumber;
    }

    public Boolean getTeorema() {
        if (teorema == null) {
            TreeMap<String, Integer> map = new TreeMap<>();
            for (int n=0;n<Math.pow(2,elementaryFormulas.size());n++){
                int i=0;
                Iterator<String> iter =elementaryFormulas.iterator();
                while (iter.hasNext()){
                    map.put(iter.next(),(n>>i++)%2);
                }
                if (this.formulaValue01(map)==0) return teorema=false;
            }

            return teorema=true;
        }
        return teorema;
    }

    abstract Integer formulaValue01(TreeMap<String, Integer> map);

    public Formula formulaCod(ArrayDeque<Course> cod) throws NotEnoughDepthFormulaException {
        if (cod.size() == 0) {
            return this;
        } else if (cod.size() < this.depthOfFormula) {
            Course c = cod.poll();
            if (c == Course.L && this instanceof FormulaImplication)
                return ((FormulaImplication) this).getF1().formulaCod(cod);
            else if (c == Course.R && this instanceof FormulaImplication)
                return ((FormulaImplication) this).getF2().formulaCod(cod);
            else if (c == Course.N && this instanceof FormulaNegative)
                return ((FormulaNegative) this).getF().formulaCod(cod);
        }

        throw new NotEnoughDepthFormulaException() ;
    }

    public Formula formulaCod(String s) throws NotEnoughDepthFormulaException {
        return formulaCod(codeFromString(s));
    }

    public ArrayList<Formula> vuvidZAxiom(Formula formula){
        if (!formula.getTeorema()) return null;

        Formula f;
        if(((FormulaImplication)formula).getF1().getTeorema()){

        }

        return null;
    }


    private static ArrayDeque<Course> codeFromString(String s) {
        if (s.replace("L", "").replace("R", "").replace("N", "").length() != 0)
            return null;

        ArrayDeque<Course> cod = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') cod.offer(Course.L);
            else if (s.charAt(i) == 'R') cod.offer(Course.R);
            else if (s.charAt(i) == 'N') cod.offer(Course.N);
        }
        return cod;
    }

}

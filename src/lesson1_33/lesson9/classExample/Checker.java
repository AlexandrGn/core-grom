package lesson1_33.lesson9.classExample;

public class Checker{
    //public - з будь якої точки проекту
    //private - тільки в даному класі
    //default - во всех классах которые находятся непосредственно внутри пакета
    //protected - єто default+ доступны в наследниках класса

    private int companyNamesValidatedCount=0;

    public boolean checkCompanyName(String companyName) {
        if (companyNamesValidatedCount>10)
            return true;
        companyNamesValidatedCount++;
        return companyName != "Google" || companyName != "Amazon";
    }
}

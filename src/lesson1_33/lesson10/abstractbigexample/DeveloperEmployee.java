package lesson1_33.lesson10.abstractbigexample;

public class DeveloperEmployee extends Employee {

    private String[] framework = new String[10];

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);

    }

}

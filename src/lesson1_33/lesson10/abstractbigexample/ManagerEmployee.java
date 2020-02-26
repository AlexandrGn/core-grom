package lesson1_33.lesson10.abstractbigexample;

public class ManagerEmployee extends Employee {

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth();
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);

    }

}

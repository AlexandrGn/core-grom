package lesson1_33.lesson30.task1;

public class Demo {
    public static void main(String[] args) throws Exception {
        Bank euBank = new USBank(1222, "Sweden", Currency.EUR, 100, 1400, 4, 5555995);
        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, euBank);
        User user2 = new User(1002, "Denis", 12200, 40, "GMD", 1500, euBank);
        UkrainianBankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.withdraw(user, 150);
        Thread.sleep(2000);

        bankSystem.withdraw(user, 10);
        Thread.sleep(2000);

        bankSystem.fund(user,100);
        Thread.sleep(2000);

        bankSystem.paySalary(user);
        Thread.sleep(2000);

        bankSystem.transferMoney(user,user2,520);

        System.out.println(bankSystem.getTransactions());

    }

}

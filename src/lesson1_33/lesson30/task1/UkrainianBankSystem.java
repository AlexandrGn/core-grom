package lesson1_33.lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UkrainianBankSystem implements BankSystem {

    private Set<Transaction> transactions = new TreeSet<>();

    @Override
    public void withdraw(User user, int amount) {
        double summa = amountWithCommissiom(user, amount);
        if (checkWithraw(user, summa, amount))
            user.setBalance(user.getBalance() - summa);

        createAndSaveTransaction(new Date(), TransactionType.WITHORAWAL, amount, "dgd");
    }

    @Override
    public void fund(User user, int amount) {
        addFund(user, amount);

        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "dgd");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double summa = amountWithCommissiom(fromUser, amount);
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency() && checkWithraw(fromUser, summa, amount) && checkFund(toUser, amount)) {
            fromUser.setBalance(fromUser.getBalance() - summa);
            toUser.setBalance(toUser.getBalance() + amount);
        }

        createAndSaveTransaction(new Date(), TransactionType.TRANSFER, amount, "transfer");
    }

    @Override
    public void paySalary(User user) {
        addFund(user, user.getSalary());

        createAndSaveTransaction(new Date(), TransactionType.SALARY_INCOME, user.getSalary(), "transfer");
    }


    private void addFund(User user, int amount) {
        if (checkFund(user, amount))
            user.setBalance(user.getBalance() + amount);
    }

    private boolean checkWithraw(User user, double summa, int amount) {
        if (user.getBank().getLimitOfWithdrawal() < summa || summa > user.getBalance()) {
            System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
            return false;
        }
        return true;
    }

    private boolean checkFund(User user, int amount) {
        if (user.getBank().getLimitOfFunding() >= amount)
            return true;
        return false;
    }

    private double amountWithCommissiom(User user, int amount) {
        return amount + user.getBank().getCommission(amount) * amount;
    }

    private Transaction createAndSaveTransaction(Date dateCreated, TransactionType type, int amount, String descr) {
        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), dateCreated, null, type, amount, descr);
        transactions.add(tr);
        return tr;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}

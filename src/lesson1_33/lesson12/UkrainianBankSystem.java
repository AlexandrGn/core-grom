package lesson1_33.lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        double summa = amountWithCommissiom(user, amount);
        if (checkWithraw(user, summa, amount))
            user.setBalance(user.getBalance() - summa);
    }

    @Override
    public void fund(User user, int amount) {
        if (checkFund(user, amount))
            user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double summa = amountWithCommissiom(fromUser, amount);
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency() && checkWithraw(fromUser, summa, amount) && checkFund(toUser, amount)) {
            fromUser.setBalance(fromUser.getBalance() - summa);
            toUser.setBalance(toUser.getBalance() + amount);
            //fromUser.getBank().setTotalCapital(fromUser.getBank().getTotalCapital()-amount);
            //toUser.getBank().setTotalCapital(toUser.getBank().getTotalCapital()+amount);
        }
    }

    @Override
    public void paySalary(User user) {
        //user.setBalance(user.getBalance()*(1+user.getBank().getMonthlyRate()) + user.getSalary());
        fund(user, user.getSalary());
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
}

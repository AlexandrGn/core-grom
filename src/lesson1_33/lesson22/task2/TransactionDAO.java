package lesson1_33.lesson22.task2;

import lesson1_33.lesson22.task2.exception.BadRequestException;
import lesson1_33.lesson22.task2.exception.InternalServerException;
import lesson1_33.lesson22.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private static Transaction[] transactions = new Transaction[10];

    public static Transaction save(Transaction transaction) throws Exception {
        validate(transaction);

        int index = freePlaceInTransactions(transaction);
        transactions[index] = transaction;

        return transactions[index];
    }

    public static Transaction[] transactionList() {
        int count = 0;
        for (Transaction tr : transactions)
            if (tr != null)
                count++;

        Transaction newTransaction[] = new Transaction[count];

        int i = 0;
        for (Transaction tr : transactions)
            if (tr != null)
                newTransaction[i++] = tr;

        return newTransaction;
    }

    public static Transaction[] transactionList(String city) {
        int count = 0;
        for (Transaction tr : transactions)
            if (tr != null && city.equals(tr.getCity()))
                count++;

        Transaction newTransaction[] = new Transaction[count];

        int i = 0;
        for (Transaction tr : transactions)
            if (tr != null && city.equals(tr.getCity()))
                newTransaction[i++] = tr;

        return newTransaction;
    }

    public static Transaction[] transactionList(int amount) {
        int count = 0;
        for (Transaction tr : transactions)
            if (tr != null && amount == tr.getAmount())
                count++;

        Transaction newTransaction[] = new Transaction[count];

        int i = 0;
        for (Transaction tr : transactions)
            if (tr != null && amount == tr.getAmount())
                newTransaction[i++] = tr;

        return newTransaction;
    }


    private static void validate(Transaction transaction) throws Exception {

        int count = 0;
        int amount = 0;
        for (Transaction tr : transactions)
            if (tr != null && equalityDate(transaction.getDateCreated(), tr.getDateCreated())) {
                count++;
                amount += tr.getAmount();
            }

        if (count >= Utils.getLimitTransactionsPerDayCount())
            //лимит транзакций за день
            throw new LimitExceeded("Limit transactions per day count " + transaction.getId() + ". Not saved");

        correctCity(transaction);

        if (transaction.getAmount() > Utils.getLimitSimpleTransactionAmount())
            //Сумма транзакции больше лимита
            throw new LimitExceeded("Limit simple transaction amount " + transaction.getId() + ". Not saved");

        if (amount + transaction.getAmount() > Utils.getLimitTransactionsPerDayAmount())
            //Превышен лимит суммы за день
            throw new LimitExceeded("Limit transactions per day amount " + transaction.getId() + ". Not saved");

        freePlaceInTransactions(transaction);
    }

    private static boolean equalityDate(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar2.setTime(date2);

        int month1 = calendar1.get(Calendar.MONTH);
        int day1 = calendar1.get(Calendar.DAY_OF_MONTH);
        int month2 = calendar1.get(Calendar.MONTH);
        int day2 = calendar1.get(Calendar.DAY_OF_MONTH);

        return (month1 == month2 && day1 == day2);
    }

    private static int freePlaceInTransactions(Transaction transaction) throws InternalServerException {
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] == null)
                return i;
        //Места в истории транзакций нет
        throw new InternalServerException("No places in the transaction history " + transaction.getId() + ". Not saved");
    }

    private static void correctCity(Transaction transaction) throws BadRequestException {
        for (String city : Utils.getCities())
            if (city.equals(transaction.getCity()))
                return;
        //город не разрешен
        throw new BadRequestException("City is not allowed " + transaction.getId() + ". Not saved");
    }

}
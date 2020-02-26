package lesson1_33.lesson20.task2;

import lesson1_33.lesson20.task2.exception.BadRequestException;
import lesson1_33.lesson20.task2.exception.InternalServerException;
import lesson1_33.lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();


    public Transaction save(Transaction transaction) throws Exception {
        validate(transaction);

        int index = freePlaceInTransactions(transaction);
        transactions[index] = transaction;

        return transactions[index];
    }

    public Transaction[] transactionList() {
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

    public Transaction[] transactionList(String city) {
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

    public Transaction[] transactionList(int amount) {
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


    private void validate(Transaction transaction) throws Exception {
        Transaction[] newTransaction = getTransactionsPerDay(transaction.getDateCreated());

        int count = 0;
        int amount = 0;
        for (Transaction tr : newTransaction) {
            count++;
            amount += tr.getAmount();
        }

        if (count >= utils.getLimitTransactionsPerDayCount())
            //лимит транзакций за день
            throw new LimitExceeded("Limit transactions per day count " + transaction.getId() + ". Not saved");

        correctCity(transaction);

        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            //Сумма транзакции больше лимита
            throw new LimitExceeded("Limit simple transaction amount " + transaction.getId() + ". Not saved");

        if (amount + transaction.getAmount() > utils.getLimitTransactionsPerDayAmount())
            //Превышен лимит суммы за день
            throw new LimitExceeded("Limit transactions per day amount " + transaction.getId() + ". Not saved");

    }

    private int freePlaceInTransactions(Transaction transaction) throws InternalServerException {
        for (int i = 0; i < transactions.length; i++)
            if (transactions[i] == null)
                return i;
        //Места в истории транзакций нет
        throw new InternalServerException("No places in the transaction history " + transaction.getId() + ". Not saved");
    }

    private void correctCity(Transaction transaction) throws BadRequestException {
        for (String city : utils.getCities())
            if (city.equals(transaction.getCity()))
                return;
        //город не разрешен
        throw new BadRequestException("City is not allowed " + transaction.getId() + ". Not saved");
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    result[index] = transaction;
                index++;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        String trs = "";
        for (Transaction transaction : transactions) {
            trs = trs + '\n' + transaction;
        }
        return "-----------------------------------------------------------------------------------------------------" + '\n' +
                "TransactionDAO{" +
                "transactions=" + trs +
                '}' + '\n' +
                "-----------------------------------------------------------------------------------------------------";
    }

//задавав питання по цьому коду
//    public Transaction[] newTran() {
//
//        int count = 0;
//        int[] indexes = new int[transactions.length];
//
//        for (int i = 0; i < transactions.length; i++)
//            if (U) {
//                indexes[count] = i;
//                count++;
//            }
//
//
//        Transaction[] newTransaction = new Transaction[count];
//
//        for (int i = 0; i < count; i++)
//            newTransaction[i] = transactions[indexes[i]];
//
//        return newTransaction;
//
//    }
}
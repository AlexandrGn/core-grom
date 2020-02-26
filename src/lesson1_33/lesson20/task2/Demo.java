package lesson1_33.lesson20.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        TransactionDAO transactionDAO1 = new TransactionDAO();
        TransactionDAO transactionDAO2 = new TransactionDAO();
        TransactionDAO transactionDAO3 = new TransactionDAO();

        Transaction[] transactions = new Transaction[50];

        transactions[0] = new Transaction(100, "city1", 4000, "as", TransactionType.INCOME, new Date(500));
        transactions[1] = new Transaction(101, "city1", 4000, "as", TransactionType.INCOME, new Date(502));
        transactions[2] = new Transaction(102, "city1", 4000, "as", TransactionType.INCOME, new Date(1000));
        transactions[3] = new Transaction(103, "city1", 4000, "as", TransactionType.INCOME, new Date(500));
        transactions[4] = new Transaction(104, "city2", 4000, "as", TransactionType.OUTCOME, new Date(500));
        transactions[5] = new Transaction(105, "city2", 4000, "as", TransactionType.INCOME, new Date(500));
        transactions[6] = new Transaction(106, "city2", 4000, "as", TransactionType.INCOME, new Date(500));
        transactions[7] = new Transaction(107, "city2", 500, "as", TransactionType.INCOME, new Date(501));
        transactions[8] = new Transaction(108, "city3", 500, "as", TransactionType.INCOME, new Date(500));
        transactions[9] = new Transaction(109, "city3", 30, "as", TransactionType.INCOME, new Date(510));
        transactions[10] = new Transaction(110, "city3", 500, "as", TransactionType.INCOME, new Date(510));
        transactions[11] = new Transaction(111, "city3", 500, "as", TransactionType.INCOME, new Date(510));
        transactions[12] = new Transaction(112, "city4", 50, "as", TransactionType.INCOME, new Date(510));
        transactions[13] = new Transaction(113, "city4", 500, "as", TransactionType.INCOME, new Date(550));
        transactions[14] = new Transaction(114, "city4", 500, "as", TransactionType.INCOME, new Date(580));
        transactions[15] = new Transaction(115, "city1", 100000, "as", TransactionType.INCOME, new Date(580));

        System.out.println(transactionDAO1.toString());

        int[] index = new int[]{0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13};
        for (int i = 0; i < 12; i++) {
            try {
                transactionDAO1.save(transactions[index[i]]);
                System.out.println("Добавлено " + transactions[index[i]].getId());
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }

            System.out.println(transactionDAO1.toString());
        }




//        Arrays.toString(transactionDAO1.transactionList());

        try {
            System.out.println(Arrays.toString(transactionDAO1.transactionList("city1")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(transactionDAO1.transactionList(500)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Arrays.toString(transactionDAO1.transactionList(500)));
        System.out.println(Arrays.toString(transactionDAO1.transactionList("city2")));
        System.out.println(Arrays.toString(transactionDAO2.transactionList(500)));


    }
}
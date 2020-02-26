package lesson1_33.lesson20.task2;

public class Utils {
    private int limitTransactionsPerDayCount = 5;
    private int limitTransactionsPerDayAmount = 10000;
    private int limitSimpleTransactionAmount = 4000;
    private String[] cities = new String[]{"city1", "city2"};

    public int getLimitTransactionsPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public int getLimitTransactionsPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public String[] getCities() {
        return cities;
    }

}
package lesson1_33.lesson22.task2;

public class Utils {
    private static int limitTransactionsPerDayCount = 5;
    private static int limitTransactionsPerDayAmount = 10000;
    private static int limitSimpleTransactionAmount = 4000;
    private static String[] cities = new String[]{"city1", "city2"};

    public static int getLimitTransactionsPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public static int getLimitTransactionsPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public static int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public static String[] getCities() {
        return cities;
    }

}
package lesson1_33.lesson10.abstractfirstexample;

public abstract class DbProvider {

    private String dbHost;

//    public DbProvider(String dbHost) {
//        this.dbHost = dbHost;
//    }
    abstract void connectToDb();

    abstract void disconnecrromDb();

    void printDbHost() {
        System.out.println("Db host is" + dbHost);
    }

}

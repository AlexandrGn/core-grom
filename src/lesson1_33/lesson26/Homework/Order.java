package lesson1_33.lesson26.Homework;


public class Order {
    private long id;
    private int prica;
    private String currency;
    private String itemName;
    private String shopldentificator;

    public Order(long id, int prica, String currency, String itemName, String shopldentificator) {
        this.id = id;
        this.prica = prica;
        this.currency = currency;
        this.itemName = itemName;
        this.shopldentificator = shopldentificator;
    }

    public long getId() {
        return id;
    }

    public int getPrica() {
        return prica;
    }

    public String getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopldentificator() {
        return shopldentificator;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", prica=" + prica +
                ", currency='" + currency + '\'' +
                ", itemName='" + itemName + '\'' +
                ", shopldentificator='" + shopldentificator + '\'' +
                '}';
    }
}


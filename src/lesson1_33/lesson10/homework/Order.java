package lesson1_33.lesson10.homework;

import java.util.Date;

public abstract class Order {

    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipFromCity;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;
    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrise, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrise;
        this.customerOwned = customerOwned;
    }

    abstract public void validateOrder();

    abstract public void calculatePrice();

    public void confirmShipping() {
        if (getDateShipped() == null) setDateShipped(new Date());
    }

    //..................................
    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    protected boolean provercaFromCity(String[] city) {
        for (String c : city) {
            if (shipFromCity.equals(c)) {
                return true;
            }
        }
        return false;
    }

    protected boolean provercaToCity(String[] city) {
        for (String c : city) {
            if (shipToCity.equals(c)) {
                return true;
            }
        }
        return false;
    }
}

package lesson1_33.lesson10.homework;

import java.util.Date;

public class FurnitureOrder extends Order {

    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrise, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrise, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        String cityFrom[] = {"Киев", "Львов"};
        if (getBasePrice() >= 500 && !(getCustomerOwned().getName().equals("Тест")) && provercaFromCity(cityFrom)) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        int price = getBasePrice();
        setTotalPrice(price >= 5000 ? price * (1 + 0.02) : price * (1 + 0.05));
    }

}

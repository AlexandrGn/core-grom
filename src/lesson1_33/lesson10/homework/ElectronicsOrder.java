package lesson1_33.lesson10.homework;

import java.util.Date;

public class ElectronicsOrder extends Order {

    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrise, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrise, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String cityFrom[] = {"Киев", "Одесса", "Днепр", "Харьков"};
        String cityTo[] = {"Киев", "Одесса", "Днепр", "Харьков"};
        if (getBasePrice() >= 100 && getCustomerOwned().getGender().equals("Женский") && provercaFromCity(cityFrom) && provercaToCity(cityTo)) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        String cityTo[] = {"Киев", "Одесса"};
        double procentDostavku = provercaToCity(cityTo) == true ? 0.1 : 0.15;
        double skidka = 0.05;
        double price = getBasePrice() > 1000 ? getBasePrice() * (1 - skidka) : getBasePrice();
        double priceDostavka = price * procentDostavku;
        setTotalPrice(price + priceDostavka);
    }
}

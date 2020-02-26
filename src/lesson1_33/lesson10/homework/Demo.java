package lesson1_33.lesson10.homework;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Denis", "Львов", "Мужской");
        Customer customer2 = new Customer("Aleksey", "Вінниця", "Мужской");
        Customer customer3 = new Customer("Тесdт", "Київ", "Женский");
        Customer customer4 = new Customer("Киев", "Киев", "Женский");

//        System.out.println();
        ElectronicsOrder electronicaOrder1 = new ElectronicsOrder("Phone", new Date(), "Киев", "Киев", 6000, customer3, 20);
        ElectronicsOrder electronicaOrder2 = new ElectronicsOrder("Nout", new Date(), "Киев", "Киев", 1200, customer3, 50);
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Krislo", new Date(), "Киев", "d", 500, customer3, "f");
        FurnitureOrder furnitureOrder2 = new FurnitureOrder("Divan", new Date(), "d", "d", 1200, customer4, "dd");

        electronicaOrder1.calculatePrice();
        electronicaOrder1.validateOrder();
        electronicaOrder1.confirmShipping();

        System.out.println(electronicaOrder1.getDateConfirmed());
        System.out.println(electronicaOrder1.getTotalPrice());

        System.out.println();

        //System.out.println();
//        electronicaOrder2.calculatePrice();
//        electronicaOrder2.validateOrder();
//        electronicaOrder2.confirmShipping();
        //System.out.println();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.validateOrder();
        furnitureOrder1.confirmShipping();

        System.out.println(furnitureOrder1.getDateConfirmed());
        System.out.println(furnitureOrder1.getTotalPrice());

        //System.out.println();
//        furnitureOrder2.calculatePrice();
//        furnitureOrder2.validateOrder();
//        furnitureOrder2.confirmShipping();
    }

}

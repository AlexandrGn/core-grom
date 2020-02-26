package lesson1_33.lesson30.Homework;

import java.util.Collection;
import java.util.HashSet;

public class CustomerDAO {
    private static HashSet<Customer> customers = new HashSet<>();

    public static void addAll(Collection<Customer> collection) {
        customers.addAll(collection);
    }

    public static Customer add(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public static Customer delete(Customer customer) {
        customers.remove(customer);
        return customer;
    }

    public static String toStringStatic() {
        return "EmployeeDAO{" +
                "customers=" + customers +
                '}';
    }

}

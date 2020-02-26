package lesson1_33.lesson30.Homework;

public class Project {
    private String name;
    private Customer customer;

    public Project(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return '\n' + "Project{" +
                "name='" + name + '\'' +
                ", customer=" + customer +
                '}';
    }
}

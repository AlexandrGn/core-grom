package lesson1_33.lesson6;

import java.util.Date;

public class User {

    String name;
    int age;
    String city;
    Date lastActiveDate;
    boolean isActive;

    public User() {
    }

    public User(String Name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = Name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String Name) {
        this.name = Name;
    }

    void logIn() {
        lastActiveDate = new Date();
    }

    void isActive(boolean status) {
        isActive = status;
    }

    void increaseAge() {
        age++;
    }
}

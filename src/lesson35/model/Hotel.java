package lesson35.model;

import lesson35.exceptions.InvalidInput;

public class Hotel extends IdEntity {
    private String name;
    private String country;
    private String city;
    private String street;

    public Hotel(String name, String country, String city, String street) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public Hotel(long id, String name, String country, String city, String street) {
        this(name,country,city,street);
        super.setId(id);
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }


    @Override
    public String toString() {
        return super.toString() + ","
                + name + ","
                + country + ","
                + city + ","
                + street;
    }
}

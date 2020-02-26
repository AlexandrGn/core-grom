package lesson35.model;

import lesson35.exceptions.InvalidInput;

import java.util.Date;

public class Room extends IdEntity {
    private int numberOfGuests;
    private double price;
    private boolean breakfastIncluded;
    private boolean petsAllowed;
    private Date dateAvailableFrom;
    private Hotel hotel;

    public Room(int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, Hotel hotel) {
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotel = hotel;
    }

    public Room(long id, int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, Hotel hotel) {
        this(numberOfGuests, price, breakfastIncluded, petsAllowed, dateAvailableFrom, hotel);
        super.setId(id);
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                Integer.toString(numberOfGuests) + "," +
                Double.toString(price) + "," +
                Boolean.toString(breakfastIncluded) + "," +
                Boolean.toString(petsAllowed) + "," +
                toStringFormat(dateAvailableFrom) + "," +
                Long.toString(hotel.getId());
    }
}

package lesson1_33.lesson11.hotelBronReservation;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

}

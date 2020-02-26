package lesson1_33.lesson15.IPE;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();

}

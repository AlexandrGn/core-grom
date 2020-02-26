package lesson1_33.lesson11.hotelBronReservation;
//тестовий, він не бере участі в закальній структурі
public abstract class TestSuperClassApi implements API {

    @Override
    abstract public Room[] findRooms(int price, int persons, String city, String hotel);

    @Override
    abstract public Room[] getAll();

    public Room[] findRooms(int price, int persons, String city, String hotel, boolean b, Room[] rooms, int countRooms) {
        if (rooms == null) return null;
        Room roomsFinding[];
        int[] massiv = new int[countRooms];
        int index = 0;
        int i = 0;
        for (Room r : rooms) {
            if (b) {
                massiv[index++] = i;
            }
            i++;
        }

        if (index == 0) return null;

        roomsFinding = new Room[index];
        for (int j = 0; j < index; j++)
            roomsFinding[j] = rooms[massiv[j]];

        return roomsFinding;
    }

}

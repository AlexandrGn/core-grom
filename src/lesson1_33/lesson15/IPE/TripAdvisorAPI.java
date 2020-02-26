package lesson1_33.lesson15.IPE;

public class TripAdvisorAPI implements API {
    private Room[] rooms;
    private int countRooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
        if (rooms != null) this.countRooms = rooms.length;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        if (rooms == null) return null;
        Room roomsFinding[];
        int[] massiv = new int[countRooms];
        int index = 0;
        int i = 0;
        for (Room r : rooms) {
            if (r != null
                    && r.getPersons() <= persons + 1 && r.getPersons() >= persons - 1
                    && r.getCityName() == city
                    && r.getHotelName() == hotel
                    && price == r.getPrice()) {
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

    @Override
    public Room[] getAll() {
        return rooms;
    }

    public int getCountRooms() {
        return countRooms;
    }
}

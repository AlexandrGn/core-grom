package lesson1_33.lesson11.hotelBronReservation;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        if (apis == null) return null;

        int index1 = 0;
        for (API api : apis)
            if (api != null)
                index1++;

        if (index1 == 0) return null;

        Room[][] roomsFinding = new Room[index1][];

        int index2 = 0;
        for (API api : apis)
            if (api != null)
                roomsFinding[index2++] = api.findRooms(price, persons, city, hotel);

        int countRooms = 0;
        for (Room[] r : roomsFinding)
            if (r != null)
                countRooms += r.length;

        Room[] roomsFindingFinish = new Room[countRooms];

        int index3 = 0;
        for (Room[] r : roomsFinding)
            if (r != null)
                for (Room rr : r)
                    if (rr != null)
                        roomsFindingFinish[index3++] = rr;

        return roomsFindingFinish;
    }


    Room[] check(API api1, API api2) {
        if (api1 == null || api2 == null || api1.getAll() == null || api2.getAll() == null
                || api1.getAll().length == 0 || api2.getAll().length == 0) return null;

        int massiv[] = new int[api1.getAll().length];
        int count = 0;
        int i = 0;
        for (Room r : api1.getAll()) {
            if (r != null)
                for (Room rr : api2.getAll())
                    if (rr != null
                            && r.getPrice() == rr.getPrice() && r.getPersons() == rr.getPersons()
                            && r.getHotelName() == rr.getHotelName() && r.getCityName() == rr.getCityName())
                        massiv[count++] = i;
            i++;
        }

        if (count == 0) return null;

        Room[] rooms = new Room[count];
        for (int j = 0; j < count; j++)
            rooms[j] = api1.getAll()[massiv[j]];

        return rooms;
    }

}


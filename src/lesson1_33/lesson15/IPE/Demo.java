package lesson1_33.lesson15.IPE;

public class Demo {


    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Room room1 = new Room(1000, 200, 2, null, "hotel1", "Kiev");
        Room room2 = new Room(1001, 220, 1, null, "hotel1", "Lviv");
        Room room3 = new Room(1002, 250, 2, null, "hotel2", "Kiev");
        Room room4 = new Room(1003, 280, 3, null, "hotel1", "Odessa");
        Room room5 = new Room(1004, 100, 1, null, "hotel3", "Kiev");
        Room room6 = new Room(1005, 120, 2, null, "hotel2", "Harkiv");
        Room room7 = new Room(1006, 200, 2, null, "hotel1", "Kiev");
        Room room8 = new Room(1007, 100, 2, null, "hotel5", "Lviv");
        Room room9 = new Room(1008, 300, 3, null, "hotel1", "Lviv");
        Room room10 = new Room(1009, 2000, 5, null, "hotel4", "Harkiv");
        Room room11 = new Room(1010, 50, 2, null, "hotel1", "Harkiv");
        Room room12 = new Room(1011, 170, 2, null, "hotel3", "Odessa");
        Room room13 = new Room(1012, 205, 2, null, "hotel2", "Harkiv");
        Room room14 = new Room(1013, 80, 1, null, "hotel4", "Harkiv");
        Room room15 = new Room(1014, 350, 2, null, "hotel1", "Odessa");
        Room room16 = new Room(1015, 400, 3, null, "hotel4", "Odessa");
        Room room17 = new Room(1016, 420, 3, null, "hotel1", "Lviv");
        Room room18 = new Room(1017, 150, 2, null, "hotel3", "Kiev");
        Room room19 = new Room(1018, 120, 2, null, "hotel2", "Kiev");
        Room room20 = new Room(1019, 20, 2, null, "hotel1", "Kiev");

        Room[] rooms1 = new Room[]{room1, room2, room3, room4, room5, room6, room7, room8, room9, room10,
                room11, room12, room13, room14, room15, room16, room17, room18, room19, room20};
        Room[] rooms2 = new Room[]{room7, room2};
        Room[] rooms3 = null;
        Room[] rooms4 = new Room[]{room1, null, room8, room19, null};


        BookingComAPI bookingComAPI = new BookingComAPI(rooms2);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms4);
        GoogleAPI googleAPI = new GoogleAPI(rooms3);
        GoogleAPI googleAPI1 = new GoogleAPI(rooms2);

        Controller controller = new Controller(new API[]{bookingComAPI, tripAdvisorAPI, googleAPI, googleAPI1});

        //Room[] rooms0 = bookingComAPI.findRooms(170, 2, "Kiev", "hotel3");
        //Room[] rooms0 = tripAdvisorAPI.findRooms(170, 2, "Kiev", "hotel3");
        //Room[] rooms0 = googleAPI.findRooms(170, 2, "Kiev", "hotel3");

        Room[] rooms0 = controller.check(googleAPI1,tripAdvisorAPI);
        //bookingComAPI.f
        if (rooms0 != null && rooms0.length != 0)
            for (Room r : rooms0)
                System.out.println(r);


    }
}

package com.nazar.practice.module05.task053;

import com.nazar.practice.module05.task051.Room;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    @Override
    public Room[] getRooms() {
        return new Room[0];
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        ArrayList<Room> list = new ArrayList<Room>();
        Room shablonTripAdvisorAPI = new Room(price, persons, hotel, city);
        for (Room goodRoom : rooms) {
            if (shablonTripAdvisorAPI.equals(goodRoom) && shablonTripAdvisorAPI.getHotelName().equals(hotel)) {
                System.out.println("TripAdvisorAPI return " + goodRoom);
                list.add(goodRoom);
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    public TripAdvisorAPI() {
        rooms = new Room[5];

        Room room11 = new Room(6, 100, 1, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");
        Room room12 = new Room(7, 200, 2, new Date(117, 8, 22, 12, 22, 32), "Sonce", "Lviv");
        Room room13 = new Room(8, 300, 3, new Date(117, 8, 22, 12, 22, 32), "Sonce", "Lviv");
        Room room14 = new Room(9, 400, 4, new Date(117, 8, 22, 12, 22, 32), "Sonce", "Lviv");
        Room room15 = new Room(10, 500, 4, new Date(117, 8, 22, 12, 22, 32), "Sonce", "Lviv");

        rooms[0] = room11;
        rooms[1] = room12;
        rooms[2] = room13;
        rooms[3] = room14;
        rooms[4] = room15;
    }

    private Room[] rooms;

}

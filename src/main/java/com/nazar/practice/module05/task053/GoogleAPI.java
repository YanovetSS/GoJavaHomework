package com.nazar.practice.module05.task053;

import com.nazar.practice.module05.task051.Room;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        ArrayList<Room> list = new ArrayList<Room>();
        Room shablonRoomGoogleAPI = new Room(price, persons, hotel, city);
        for (Room goodRoom : rooms) {
            if (shablonRoomGoogleAPI.equals(goodRoom) && shablonRoomGoogleAPI.getHotelName().equals(goodRoom)) {
                System.out.println("GoogleAPI return " + goodRoom);
                list.add(goodRoom);
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    private Room[] rooms;

    {
        rooms = new Room[5];

        Room room6 = new Room(6, 100, 1, new Date(117, 8, 22, 12, 22, 32), "Libid", "Odessa");
        Room room7 = new Room(7, 200, 2, new Date(117, 8, 22, 12, 22, 32), "Libid", "Odessa");
        Room room8 = new Room(8, 300, 3, new Date(117, 8, 22, 12, 22, 32), "Libid", "Odessa");
        Room room9 = new Room(9, 400, 4, new Date(117, 8, 22, 12, 22, 32), "Libid", "Odessa");
        Room room10 = new Room(10, 500, 4, new Date(117, 8, 22, 12, 22, 32), "Libid", "Odessa");

        rooms[0] = room6;
        rooms[1] = room7;
        rooms[2] = room8;
        rooms[3] = room9;
        rooms[4] = room10;

    }

}

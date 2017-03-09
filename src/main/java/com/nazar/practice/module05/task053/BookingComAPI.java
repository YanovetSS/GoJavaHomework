package com.nazar.practice.module05.task053;


import com.nazar.practice.module05.task051.Room;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        ArrayList<Room> list = new ArrayList<Room>();
        Room shablonRoomBookingComAPI = new Room(price, persons, hotel, city);
        for (Room goodRoom : rooms) {
            if (shablonRoomBookingComAPI.equals(goodRoom) && shablonRoomBookingComAPI.getHotelName().equals(hotel)) {
                System.out.println("BookingComAPI return " + goodRoom);
                list.add(goodRoom);
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    private Room[] rooms = new Room[5];
    {
        Room room1 = new Room(1, 100, 1, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");
        Room room2 = new Room(2, 100, 1, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");
        Room room3 = new Room(3, 300, 3, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");
        Room room4 = new Room(4, 400, 4, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");
        Room room5 = new Room(5, 500, 4, new Date(117, 8, 22, 12, 22, 32), "Ukraine", "Kiev");


        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;


    }


}

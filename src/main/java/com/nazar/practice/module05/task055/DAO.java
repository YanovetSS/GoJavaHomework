package com.nazar.practice.module05.task055;


import com.nazar.practice.module05.task051.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAO {

    private Room[] roomDB = new Room[15];
    private List<Room> myRoomsList = new ArrayList();
    private int currentElementNumber = 0;

    public int getCurrentElementNumber() {
        return currentElementNumber;
    }

    public void addRooms(Room rooms[]) {

        if (roomDB.length < rooms.length || (currentElementNumber + rooms.length > roomDB.length)) {
            System.out.println("Array length is too long. Required max length is = " + roomDB.length);
            return;
        }
        Room[] goodRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (currentElementNumber < roomDB.length) {
                roomDB[currentElementNumber++] = rooms[i];
            }
        }
    }

    public void printRooms() {
        System.out.println(Arrays.deepToString(roomDB));
        System.out.println("Кількість кімнат які підходять під ваш запит: " + currentElementNumber);
    }

    public int getRoomCount(Room[] roomDB) {
        int count = 0;

        for (Room room : roomDB) {
            if (room != null) {
                count++;
            }
        }
        return count;
    }


    public Room save(Room room) {
        int count = getRoomCount(roomDB);
        roomDB[count] = room;

        return room;
    }

    public boolean delete(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDb = roomDB[i];
            if (room.equals(roomInDb)) {
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }
        return true;
    }

    public Room update(Room room) {
        boolean roomFound = false;
        System.out.println("Updating " + room);
        Room foundRoom = findById(room.getId());
        if (foundRoom != null) {
            myRoomsList.remove(foundRoom);
            myRoomsList.add(room);
            roomFound = true;
        }
        if (!roomFound) {
            System.out.println("Error! Room not found!");
        }
        return room;
    }

    public Room findById(long id) {
        for (Room room: roomDB) {
            if(room.getId() ==id){
                return room;
            }
        }
        return null;
    }

    public Room[] getRoomDB() {
        return roomDB;
    }

    public List<Room> getAll() {
        return myRoomsList;
    }
}


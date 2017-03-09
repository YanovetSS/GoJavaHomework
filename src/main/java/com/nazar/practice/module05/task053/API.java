package com.nazar.practice.module05.task053;

import com.nazar.practice.module05.task051.Room;

public interface API {
    Room[] findRooms(int price, int persons, String hotel, String city);
}

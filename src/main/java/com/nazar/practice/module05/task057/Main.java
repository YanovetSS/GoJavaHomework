package com.nazar.practice.module05.task057;

import com.nazar.practice.module05.task053.API;
import com.nazar.practice.module05.task053.BookingComAPI;
import com.nazar.practice.module05.task053.GoogleAPI;
import com.nazar.practice.module05.task053.TripAdvisorAPI;
import com.nazar.practice.module05.task056.Controller;

public class Main {

    public static void main(String[] args) {
        API firstAPI = new BookingComAPI();
        API secondAPI = new TripAdvisorAPI();
        API thirdAPI = new GoogleAPI();
        Controller objectForDoSomethink = new Controller();
        objectForDoSomethink.requestRooms(100, 1, "Ukraine", "Kiev");
        objectForDoSomethink.requestRooms(400, 4, "Sonce", "Lviv");
        objectForDoSomethink.requestRooms(1,1,"lalal","lalal");
        System.out.println();
        System.out.println(objectForDoSomethink.check(firstAPI, thirdAPI));
    }
}

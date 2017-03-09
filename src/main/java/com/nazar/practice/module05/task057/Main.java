package com.nazar.practice.module05.task057;

import com.nazar.practice.module05.task056.Controller;

public class Main {

    public static void main(String[] args) {

        Controller objectForDoSomethink = new Controller();
        objectForDoSomethink.requestRooms(100, 1, "Ukraine", "Kiev");
        objectForDoSomethink.requestRooms(400, 4, "Sonce", "Lviv");
        objectForDoSomethink.requestRooms(1,1,"lalal","lalal");
    }
}

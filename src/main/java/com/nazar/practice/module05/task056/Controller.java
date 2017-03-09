package com.nazar.practice.module05.task056;

import com.nazar.practice.module05.task051.Room;
import com.nazar.practice.module05.task053.API;
import com.nazar.practice.module05.task053.BookingComAPI;
import com.nazar.practice.module05.task053.GoogleAPI;
import com.nazar.practice.module05.task053.TripAdvisorAPI;
import com.nazar.practice.module05.task055.DAO;

public class Controller {
    private DAO dao = new DAO();
    private API firstAPI = new BookingComAPI();
    private API secondAPI = new TripAdvisorAPI();
    private API thirdAPI = new GoogleAPI();

    private API[] apies = {firstAPI, secondAPI, thirdAPI};

    public Room[] requestRooms(int price, int persons, String hotel, String city) {
        System.out.println("Result: ");
        for (API api : apies) {
            dao.addRooms(api.findRooms(price, persons, hotel, city));
        }
        return dao.getRoomDB();
    }

}

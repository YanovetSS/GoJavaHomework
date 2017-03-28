package com.nazar.practice.module05.task056;

import com.nazar.practice.module05.task051.Room;
import com.nazar.practice.module05.task053.API;
import com.nazar.practice.module05.task053.BookingComAPI;
import com.nazar.practice.module05.task053.GoogleAPI;
import com.nazar.practice.module05.task053.TripAdvisorAPI;
import com.nazar.practice.module05.task055.DAO;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private DAO dao = new DAO();


    public Controller() {
         API firstAPI = new BookingComAPI();
         API secondAPI = new TripAdvisorAPI();
         API thirdAPI = new GoogleAPI();
         apies = new API[]{firstAPI, secondAPI, thirdAPI};
    }

    private API[] apies ;

    public Room[] requestRooms(int price, int persons, String hotel, String city) {
        for (API api : apies) {
            dao.addRooms(api.findRooms(price, persons, hotel, city));
        }
        return dao.getRoomDB();
    }
        public  Room[] check(API api1, API api2){
            List<Room> listOfEqualRooms = new ArrayList();
            for (Room roomFirstAPI : api1.getRooms()) {
                for (Room roomSecondAPI : api2.getRooms()) {
                    if (roomFirstAPI.equals(roomSecondAPI)) {
                        listOfEqualRooms.add(roomFirstAPI);
                        listOfEqualRooms.add(roomSecondAPI);
                    }
                }
            }
            System.out.println(listOfEqualRooms.size() + " equals rooms found!");
            return listOfEqualRooms.toArray(new Room[listOfEqualRooms.size()]);
        }
}

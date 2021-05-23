package model;

import java.util.Random;

public class ShowServices {
    public static void main(String[] args) {
        Villa villa = new Villa("thuê Villa", 300, 10000000, 5, "tuần", "1", "Double", "đầy đủ các tiện ích 5 sao", 200, 2);
        House house = new House("thuê House", 200, 5000000, 5, "tuần", "4", "Double", "đầy đủ", 2);
        Room room = new Room("thuê Room", 200, 5000000, 5, "tuần", "4", "buffe");
        villa.showInfor();
        house.showInfor();
        room.showInfor();

    }
}

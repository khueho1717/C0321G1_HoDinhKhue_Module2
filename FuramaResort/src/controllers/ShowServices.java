package controllers;

import model.House;
import model.Room;
import model.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowServices {
    public static void  showServiceRoom(String services) {
        try {

            FileReader fileReader = new FileReader(services);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List listRoom=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                Room room=new Room(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6]);
                listRoom.add(room);
            }
            for (Object room:listRoom
            ) {
                System.out.println(room.toString());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  showServiceVilla(String services) {
        try {

            FileReader fileReader = new FileReader(services);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List listVilla=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                Villa villa=new Villa(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6],strings[7],Float.parseFloat(strings[8]),Integer.parseInt(strings[9]));
                listVilla.add(villa);
            }
            for (Object room:listVilla
            ) {
                System.out.println(room.toString());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  showServiceHouse(String services) {
        try {

            FileReader fileReader = new FileReader(services);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            List listHouse=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                House house=new House(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6],strings[7],Integer.parseInt(strings[8]));
                listHouse.add(house);
            }
            for (Object house:listHouse
            ) {
                System.out.println(house.toString());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

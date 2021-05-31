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
            List listRoom1=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                Room room=new Room(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6]);
                listRoom1.add(room);
            }
            int i=1;
            for (Object room:listRoom1
            ) {
                System.out.println(i+++","+room.toString());
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
            List listVilla1=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                Villa villa=new Villa(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6],strings[7],Float.parseFloat(strings[8]),Integer.parseInt(strings[9]));
                listVilla1.add(villa);
            }
            int i=1;
            for (Object room:listVilla1
            )
                System.out.println(i+++","+room.toString());
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
            List listHouse1=new ArrayList();
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings=line.split("@");
                House house=new House(strings[1],Float.parseFloat(strings[2]),Float.parseFloat(strings[3]),Integer.parseInt(strings[4]),strings[5],strings[0],strings[6],strings[7],Integer.parseInt(strings[8]));
                listHouse1.add(house);
            }
            int i=1;
            for (Object house:listHouse1
            ) {
                System.out.println(i+++","+house.toString());
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

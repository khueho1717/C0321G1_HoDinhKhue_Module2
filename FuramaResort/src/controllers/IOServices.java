package controllers;

import model.House;
import model.Room;
import model.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOServices {
    private static final String COMMA_DELIMITER = "@";
    private static final String NEW_LINE_SEPARATOR = "\n";

    static List<Villa> listVilla = new ArrayList();
    static List<House> listHouse = new ArrayList();
    static List<Room> listRoom = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    static String fileNameVilla = "FuramaResort/src/data/Villa.csv";
    static String fileNameHouse = "FuramaResort/src/data/House.csv";
    static String fileNameRoom = "FuramaResort/src/data/Room.csv";

    public void addNewVilla(String fileName) {
        System.out.println("them dich vu villa");
        String id = inputId();
        String nameServices = inputServises();
        float useArea = inputUseArea();
        float rentalCosts = inputRentalCosts();
        int maxQuantity = inputMaxQuantity();
        String rentalType = inputRentalType();
        String roomStandard = inputRoomStandard();
        String convenient = inputConvenient();
        float poolArea = inputPoolArea();
        int numberOfFloors = inputNumberOfFloors();
        Villa villa = new Villa(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id, roomStandard, convenient, poolArea, numberOfFloors);
        listVilla.add(villa);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName, true);

            for (Villa villa1 : listVilla) {
                fileWriter.append(String.valueOf(villa1.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa1.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getUseArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getMaxQuantity()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getRentalType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa1.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa1.getConvenient());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getPoolArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa1.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public void addNewHouse(String fileName) {
        System.out.println("them dich vu House");
        String id = inputId();
        String nameServices = inputServises();
        float useArea = inputUseArea();
        float rentalCosts = inputRentalCosts();
        int maxQuantity = inputMaxQuantity();
        String rentalType = inputRentalType();
        String roomStandard = inputRoomStandard();
        String convenient = inputConvenient();
        int numberOfFloors = inputNumberOfFloors();
        House house = new House(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id, roomStandard, convenient, numberOfFloors);
        listHouse.add(house);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName, true);

            for (House house1 : listHouse) {
                fileWriter.append(String.valueOf(house1.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house1.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house1.getUseArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house1.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house1.getMaxQuantity()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house1.getRentalType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house1.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house1.getConvenient());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house1.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public void addNewRoom(String fileName) {
        System.out.println("them dich vu Room");
        String id = inputId();
        String nameServices = inputServises();
        float useArea = inputUseArea();
        float rentalCosts = inputRentalCosts();
        int maxQuantity = inputMaxQuantity();
        String rentalType = inputRentalType();
        String freeServiceIncludes = inputFreeServiceIncludes();
        Room room = new Room(nameServices, useArea, rentalCosts, maxQuantity, rentalType, id, freeServiceIncludes);
        listRoom.add(room);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName, true);

            for (Room room1 : listRoom) {
                fileWriter.append(String.valueOf(room1.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room1.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room1.getUseArea()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room1.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room1.getMaxQuantity()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room1.getRentalType()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room1.getFreeServiceIncludes());
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public String inputId() {
        System.out.println("nhap id");
        String id = scanner.nextLine();
        return id;
    }

    public String inputServises() {
        System.out.println("nhap ten dich vu");
        String nameServises = scanner.nextLine();
        return nameServises;
    }

    public float inputUseArea() {
        System.out.println("dien tich su dung");
        float useArea = Float.parseFloat(scanner.nextLine());
        return useArea;
    }

    public float inputRentalCosts() {
        System.out.println("chi phi thue");
        float rentalCosts = Float.parseFloat(scanner.nextLine());
        return rentalCosts;
    }

    public int inputMaxQuantity() {
        System.out.println("so luong nguoi toi da");
        int maxQuantity = Integer.parseInt(scanner.nextLine());
        return maxQuantity;
    }

    public String inputRentalType() {
        System.out.println("kieu thue");
        String rentalType = scanner.nextLine();
        return rentalType;
    }

    public String inputAddNameServices() {
        System.out.println("dich vu kem theo");
        String addNameServices = scanner.nextLine();
        return addNameServices;
    }

    public String InputUnit() {
        System.out.println("don vi");
        String unit = scanner.nextLine();
        return unit;
    }

    public float inputPrice() {
        System.out.println("nhap gia dich vu");
        float price = scanner.nextFloat();
        return price;
    }

    public String inputRoomStandard() {
        System.out.println("tieu chuan phong");
        String roomStandard = scanner.nextLine();
        return roomStandard;
    }

    public String inputConvenient() {
        System.out.println("mo ta tien nghi");
        String convenient = scanner.nextLine();
        return convenient;
    }

    public float inputPoolArea() {
        System.out.println("Diện tích hồ bơi");
        float poolarea = Float.parseFloat(scanner.nextLine());
        return poolarea;
    }

    public int inputNumberOfFloors() {
        System.out.println("nhap so tang");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        return numberOfFloors;
    }

    public String inputFreeServiceIncludes() {
        System.out.println("dich vu mien phi kem theo");
        String freeServiceIncludes = scanner.nextLine();
        return freeServiceIncludes;
    }
}

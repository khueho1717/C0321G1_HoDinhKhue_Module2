package commons;

import model.House;
import model.Room;
import model.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        while (true){
            System.out.println("nhap id");
            String checkId="^((SV)(VL|HO|RO)-[0-9]{4})$";
            String id = scanner.nextLine();
            Pattern pattern=Pattern.compile(checkId);
            Matcher matcher=pattern.matcher(id);
            boolean check=matcher.matches();
            if (check){
                return id;
            }else {
                System.out.println("mời bạn nhâọ lại theo đúng cấu trúc SV(VL hoặc HO hoặc RO)-XXXX");
            }
        }
    }

    public String inputServises() {
        while (true){
            System.out.println("nhap ten dich vu");
            String nameServises = scanner.nextLine();
            String checkNameServices="^(([A-Z]{1}\\w*)(, (\\w)*)*)$";
            Pattern pattern=Pattern.compile(checkNameServices);
            Matcher matcher=pattern.matcher(nameServises);
            boolean check=matcher.matches();
            if (check){
                return nameServises;
            }else {
                System.out.println("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
            }
        }
    }

    public float inputUseArea() {
        while (true){
            System.out.println("dien tich su dung");
            String useArea = scanner.nextLine();
            String checkArea="^([1-9]{1}[0-9]+)$";
            Pattern pattern=Pattern.compile(checkArea);
            Matcher matcher=pattern.matcher(useArea);
            boolean check=matcher.matches();
            if (check){
                Float area=Float.parseFloat(useArea);
                if (area>30){
                    return Float.parseFloat(useArea);
                }else {
                    System.out.println("Diện tích sử dụng phải là số thực lớn hơn 30m2");
                }
            }else {
                System.out.println("Diện tích sử dụng phải là số thực lớn hơn 30m2");
            }
        }

    }

    public float inputRentalCosts() {
        while (true) {
            System.out.println("chi phi thue");
            String rentalCosts = scanner.nextLine();
            String checkCosts = "^([0-9]+)$";
            Pattern pattern = Pattern.compile(checkCosts);
            Matcher matcher = pattern.matcher(rentalCosts);
            boolean check = matcher.matches();
            if (check) {
                Float costs = Float.parseFloat(rentalCosts);
                if (costs > 0) {
                    return costs;
                } else {
                    System.out.println("Chi phí thuê phải là số dương");
                }
            } else {
                System.out.println("Chi phí thuê phải là số dương");
            }
        }

    }

    public int inputMaxQuantity() {
        while (true) {
            System.out.println("so luong nguoi toi da");
            String maxQuantity = scanner.nextLine();
            String checkMaxQuantity = "^([0-9]+)$";
            Pattern pattern = Pattern.compile(checkMaxQuantity);
            Matcher matcher = pattern.matcher(maxQuantity);
            boolean check = matcher.matches();
            if (check) {
                int max = Integer.parseInt(maxQuantity);
                if (max > 0&&max<20) {
                    return max;
                } else {
                    System.out.println("Số lượng người tối đa phải >0 và nhỏ hơn <20");
                }
            } else {
                System.out.println("bạn nhập sai kí tự  ");
            }
        }
    }

    public String inputRentalType() {
        while (true){
            System.out.println("kieu thue");
            String rentalType = scanner.nextLine();
            String checkRentalType="^(([A-Z]{1}\\w*)(,(\\w)*)*)$";
            Pattern pattern=Pattern.compile(checkRentalType);
            Matcher matcher=pattern.matcher(rentalType);
            boolean check=matcher.matches();
            if (check){
                return rentalType;
            }else {
                System.out.println("Tên kiểu thuê phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
            }
        }
    }

    public String inputAddNameServices() {
        while (true){
            System.out.println("dich vu kem theo");
            String addNameServices = scanner.nextLine();
            String checkServices="^((masage|karaoke|food|drink|car)(, (masage|karaoke|food|drink|car)+)*)$";
            Pattern pattern=Pattern.compile(checkServices);
            Matcher matcher=pattern.matcher(addNameServices);
            boolean check=matcher.matches();
            if (check){
                return addNameServices;
            }else {
                System.out.println("Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
            }
        }

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
        while (true){
            System.out.println("dien tich su dung");
            String poolarea = scanner.nextLine();
            String checkArea="^([1-9]{1}[0-9]+)$";
            Pattern pattern=Pattern.compile(checkArea);
            Matcher matcher=pattern.matcher(poolarea);
            boolean check=matcher.matches();
            if (check){
                Float area=Float.parseFloat(poolarea);
                if (area>30){
                    return Float.parseFloat(poolarea);
                }else {
                    System.out.println("Diện tích hồ bơi sử dụng phải là số thực lớn hơn 30m2");
                }
            }else {
                System.out.println("Diện tích hồ bơi sử dụng phải là số thực lớn hơn 30m2");
            }
        }
    }

    public int inputNumberOfFloors() {
        while (true) {
            System.out.println("nhap so tang");
            String numberOfFloors = scanner.nextLine();
            String checkNumberOfFloors = "^([0-9]+)$";
            Pattern pattern = Pattern.compile(checkNumberOfFloors);
            Matcher matcher = pattern.matcher(numberOfFloors);
            boolean check = matcher.matches();
            if (check) {
                int floor = Integer.parseInt(numberOfFloors);
                if (floor > 0) {
                    return floor;
                } else {
                    System.out.println("Số tầng phải là số nguyên dương.");
                }
            } else {
                System.out.println("Bạn nhập sai cú pháp");
            }
        }
    }

    public String inputFreeServiceIncludes() {
        System.out.println("dich vu mien phi kem theo");
        String freeServiceIncludes = scanner.nextLine();
        return freeServiceIncludes;
    }
}

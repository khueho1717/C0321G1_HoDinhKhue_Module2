package controllers;

import commons.IOCustomer;
import commons.IOServices;
import model.Customer;
import model.Room;
import model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewBooking {
    public static ShowServices showServices = new ShowServices();
    public static IOCustomer ioCustomer = new IOCustomer();
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void bookingVilla() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ioCustomer.showCustomers();
        System.out.println("chọn khách hàng cần đặt dịch vụ");
        List<Customer> customerList =choiseCustomer() ;
        String choiseCustomer = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("^[0-9]+$");
        Matcher matcher1 = pattern1.matcher(choiseCustomer);
        boolean check1 = true;
        while (check1) {
            if (matcher1.matches()) {
                int choise = Integer.parseInt(choiseCustomer) - 1;
                if (choise >= customerList.size() - 1) {
                    Customer customer = customerList.get(choise - 1);
                    stringBuilder.append(customer.getNameCustomer());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getBirthDay());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getGender());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getNumberCMND());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getNumberPhone());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getEmail());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getTypeOfGuest());
                    stringBuilder.append(", ");
                    stringBuilder.append(customer.getAddress());
                    stringBuilder.append(", ");
                    check1 = false;
                } else {
                    System.out.println("hãy nhập vị trí có trong danh sách");
                    check1 = false;
                }
            } else {
                System.out.println("yêu cầu nhập đúng cú pháp");
                check1 = false;
            }
        }


        showServices.showServiceVilla("FuramaResort/src/data/Villa.csv");
        System.out.println("chọn dịch vụ Villa theo số thứ tự ");
        List<Villa> villas = readVilla();
        String choiseServices = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(choiseServices);
        boolean check = true;
        while (check) {
            if (matcher.matches()) {
                int choise = Integer.parseInt(choiseServices);
                if (choise >= villas.size() - 1) {
                    Villa servicesVilla = villas.get(choise - 1);
                    stringBuilder.append(servicesVilla.getId());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getNameServices());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getUseArea());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getRentalCosts());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getMaxQuantity());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getRentalType());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getRoomStandard());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getConvenient());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getPoolArea());
                    stringBuilder.append(", ");
                    stringBuilder.append(servicesVilla.getNumberOfFloors());
                    stringBuilder.append(", ");
                    check = false;
                } else {
                    System.out.println("hãy nhập vị trí có trong danh sách");
                    check = false;
                }
            } else {
                System.out.println("yêu cầu nhập đúng cú pháp");
                check = false;
            }
        }
        FileWriter fileWriter = new FileWriter("FuramaResort/src/data/Booking.csv",true);
        fileWriter.write(String.valueOf(stringBuilder));
        fileWriter.close();
    }

    public static List<Villa> readVilla() {
        List bookingVilla = new ArrayList();

        try {
            FileReader fileReader = new FileReader("FuramaResort/src/data/Villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("@");
                Villa villa = new Villa(strings[1], Float.parseFloat(strings[2]), Float.parseFloat(strings[3]), Integer.parseInt(strings[4]), strings[5], strings[0], strings[6], strings[7], Float.parseFloat(strings[8]), Integer.parseInt(strings[9]));
                bookingVilla.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return bookingVilla;
    }

    public static List<Customer> choiseCustomer() {
        List choiseCustomers = new ArrayList();

        try {
            FileReader fileReader = new FileReader("FuramaResort/src/data/Customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] string = line.split("#");
                Customer customer = new Customer(string[0], string[1], string[2], string[3], string[4], string[5], string[6], string[7]);

                choiseCustomers.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return choiseCustomers;
    }

    public static void main(String[] args) throws IOException {
        bookingVilla();
    }
}

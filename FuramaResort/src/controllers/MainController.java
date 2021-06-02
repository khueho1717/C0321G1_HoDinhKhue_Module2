package controllers;

import commons.*;

import java.io.IOException;
import java.util.Scanner;

import static commons.IOServices.*;
import static controllers.ShowServices.*;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    static IOServices ioServices = new IOServices();
    static IOEmployee ioEmployee = new IOEmployee();
    static IOCustomer ioCustomer = new IOCustomer();
    static NewBooking newBooking = new NewBooking();
    static BookingTickets bookingTickets=new BookingTickets();

    public static void main(String[] args) throws UserException, IOException {

        disPlayMenu();
    }

    public static void disPlayMenu() throws UserException, IOException {


        System.out.println("lua chon hien thi menu");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employer");
        System.out.println("7. Booking Teckets 4D");
        System.out.println("9. Exit");
        int choise = scanner.nextInt();
        boolean checkMenu = true;
        while (checkMenu) {
            switch (choise) {
                case 1:
                    addNewServices();
                    disPlayMenu();
                    break;
                case 2:
                    showServices();
                    disPlayMenu();
                    break;
                case 3:
                    ioCustomer.addCustomer();
                    disPlayMenu();
                    checkMenu = false;
                    break;
                case 4:
                    ioCustomer.showCustomers();
                    disPlayMenu();
                    checkMenu = false;
                    break;
                case 5:
                    addNewBooking();
                    disPlayMenu();
                    checkMenu=false;
                    break;
                case 6:
                    ioEmployee.showEmployee();
                    checkMenu = false;
                    disPlayMenu();
                    break;
                case 7:
                    bookingTickets.bookingTicket();
                    disPlayMenu();
                    checkMenu = false;
                    break;
                case 9:
                    checkMenu=false;
                    break;
            }
        }
    }

    public static void addNewServices() throws UserException, IOException {

        System.out.println("lua chon dich vu muon them vao");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        int choise = scanner.nextInt();
        boolean checkAdd = true;
        while (checkAdd) {
            switch (choise) {
                case 1:
                    ioServices.addNewVilla("FuramaResort/src/data/Villa.csv");
                    checkAdd = false;
                    break;
                case 2:
                    ioServices.addNewHouse("FuramaResort/src/data/House.csv");
                    checkAdd = false;
                    break;
                case 3:
                    ioServices.addNewRoom("FuramaResort/src/data/Room.csv");
                    checkAdd = false;
                    break;
                case 4:
                    disPlayMenu();
                    break;
                case 5:
                    checkAdd = false;
                    break;
            }
        }

    }

    public static void showServices() throws UserException, IOException {
        System.out.println("Danh sach dich vu can hien thi");
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Name Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        boolean checkShow = true;
        int choiseShow = scanner.nextInt();
        while (checkShow) {
            switch (choiseShow) {
                case 1:
                    showServiceVilla("FuramaResort/src/data/Villa.csv");
                    checkShow = false;
                    break;
                case 2:
                    showServiceHouse("FuramaResort/src/data/House.csv");
                    checkShow = false;
                    break;
                case 3:
                    showServiceRoom("FuramaResort/src/data/Room.csv");
                    checkShow = false;
                    break;
                case 4:
                    showServiceVillaNotDuplicate("FuramaResort/src/data/Villa.csv");
                    checkShow = false;
                    break;
                case 5:
                    showServiceHouseNotDuplicate("FuramaResort/src/data/House.csv");
                    disPlayMenu();
                    checkShow = false;
                    break;
                case 6:
                    showServiceRoomNotDuplicate("FuramaResort/src/data/Room.csv");
                    checkShow = false;
                    break;
                case 7:
                    disPlayMenu();
                    break;
                case 8:
                    checkShow = false;
                    break;
            }
        }
    }

    public static void addNewBooking() throws IOException, UserException {
        System.out.println("Lựa chọn dịch vụ booking");
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4.\tExit\n");
        int choiseBooking=scanner.nextInt();
        boolean checkBokking = true;
        while (checkBokking) {
            switch (choiseBooking) {
                case 1:
                    NewBooking.bookingVilla();
                    disPlayMenu();
                    checkBokking = false;
                    break;
                case 2:
                    NewBooking.bookingHouse();
                    disPlayMenu();
                    checkBokking = false;
                    break;
                case 3:
                    NewBooking.bookingRoom();
                    disPlayMenu();
                    checkBokking = false;
                    break;
                case 4:
                    checkBokking = false;
                    disPlayMenu();
                    break;
            }
        }
    }

}

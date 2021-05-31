package controllers;

import commons.IOServices;

import java.util.Scanner;

import static commons.IOServices.*;
import static controllers.ShowServices.*;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    static IOServices ioServices = new IOServices();

    public static void main(String[] args) {

        disPlayMenu();
    }

    public static void disPlayMenu() {


        System.out.println("lua chon hien thi menu");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employer");
        System.out.println("7. Exit");
        int choise = scanner.nextInt();
        boolean checkMenu = true;
        while (checkMenu) {
            switch (choise) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 7:
                    checkMenu = false;
                    break;
            }
        }
    }

    public static void addNewServices() {

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
                    ioServices.addNewVilla(fileNameVilla);
                    checkAdd=false;
                    break;
                case 2:
                    ioServices.addNewHouse(fileNameHouse);
                    checkAdd=false;
                    break;
                case 3:
                    ioServices.addNewRoom(fileNameRoom);
                    checkAdd=false;
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

    public static void showServices() {
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
                    showServiceVilla(fileNameVilla);
                    checkShow=false;
                    break;
                case 2:
                    showServiceHouse(fileNameHouse);
                    checkShow=false;
                    break;
                case 3:
                    showServiceRoom(fileNameRoom);
                    checkShow=false;
                    break;
                case 7:
                    disPlayMenu();
                    break;
                case 8:
                    checkShow=false;
                    break;
            }
        }
    }

}

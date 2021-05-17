package bai11_java_collection_framework.bai_tap.su_dung_arraylít_likedlist;

import java.util.Scanner;

import static bai11_java_collection_framework.bai_tap.su_dung_arraylít_likedlist.ProductManager.listProduct;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "iphone", "apple", 1000);
        listProduct.add(product);
        ProductManager productManager = new ProductManager();
        showMenu();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (true) {
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.edit();
                    break;
                case "3":
                    productManager.delete();
                    break;
                case "4":
                    productManager.sortProductByPrice();
                    break;
                case "5":
                    productManager.sortProductByPriceDecrease();
                    break;
                case "6":
                    productManager.show();
                    break;
                case "7":
                    productManager.searchByName();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add product.");
        System.out.println("2. Edit product by id.");
        System.out.println("3. Delete product by id.");
        System.out.println("4. Sort product by price.");
        System.out.println("5. Sort product by price decrease.");
        System.out.println("6. Show product.");
        System.out.println("7. Search by name product.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

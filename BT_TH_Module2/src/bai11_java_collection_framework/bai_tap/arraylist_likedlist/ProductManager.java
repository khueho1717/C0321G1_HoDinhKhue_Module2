package bai11_java_collection_framework.bai_tap.arraylist_likedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Product> listProduct = new ArrayList();
    Scanner scanner = new Scanner(System.in);


    public void add() {
        int id = (listProduct.size() > 0) ? (listProduct.size() + 1) : 1;
        System.out.println("product id = " + id);
        String inputNameProduct = inputName();
        String inputBrand = inputBrand();
        int inputPrice = inputPrice();
        Product product = new Product(id, inputNameProduct, inputBrand, inputPrice);
        listProduct.add(product);
        show();
    }


    public void edit() {
        boolean isExisted = false;
        int size = listProduct.size();
        int id = inputId();
        for (int i = 0; i < size; i++) {
            if (listProduct.get(i).getId() == id) {
                isExisted = true;
                listProduct.get(i).setId(inputId());
                listProduct.get(i).setNameProduct(inputName());
                listProduct.get(i).setBrand(inputBrand());
                listProduct.get(i).setPrice(inputPrice());
                break;
            }

        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", inputId());
        }
        show();
    }

    public void delete() {
        int id = inputId();
        int size = listProduct.size();
        Product product = null;
        for (int i = 0; i < size; i++) {
            if (listProduct.get(i).getId() == id) {
                product = listProduct.get(i);
                break;
            }
        }
        if (product != null) {
            listProduct.remove(product);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        show();
    }

    public void searchByName() {
        String searchName = inputName();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNameProduct().equals(searchName)) {
                System.out.println(listProduct.get(i).toString());
                break;
            }
            System.out.println("Not Found");
        }
    }


    public void sortProductByPrice() {
        Collections.sort(listProduct, new SortProductByPrice());
        show();
    }

    public void sortProductByPriceDecrease() {
        Collections.sort(listProduct, new SortProductByPriceDecrease());
        show();
    }

    public void show() {
        for (Product element : listProduct) {
            System.out.println(element);
        }
    }

    public int inputId() {
        System.out.print("Input product id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input product id again: ");
            }
        }
    }

    private String inputName() {
        System.out.print("Input product name: ");
        return scanner.nextLine();
    }

    private String inputBrand() {
        System.out.print("Input Product brand: ");
        return scanner.nextLine();
    }

    private int inputPrice() {
        System.out.println("Input Product price");
        return scanner.nextInt();
    }


}

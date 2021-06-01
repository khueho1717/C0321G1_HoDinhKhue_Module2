package commons;

import model.Customer;
import model.Services;
import model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOCustomer {
    static List<Customer> customers = new ArrayList<>();
    private static final String COMMA_DELIMITER = "#";
    private static final String NEW_LINE_SEPARATOR = "\n";

    public static void main(String[] args) throws UserException {

//        System.out.println(inputUserBirthDay());
//        addCustomer();
//        showCustomers();
    }

    public  void addCustomer() throws UserException {
        System.out.println("them khach hang");
        String nameCustomer = inputUserName();
        String birthDay = inputUserBirthDay();
        String gender = inputUserGender();
        String numberCMND = inputUserIdCard();
        System.out.println("nhap so dien thoai");
        String numberPhone = scanner.nextLine();
        String email = inputUserEmail();
        System.out.println("loai khach hang");
        String typeOfGuest = scanner.nextLine();
        System.out.println("dia chi khach hang");
        String address = scanner.nextLine();
        Customer customer = new Customer(nameCustomer, birthDay, gender, numberCMND, numberPhone, email, typeOfGuest, address);
        customers.add(customer);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("FuramaResort/src/data/Customer.csv", true);

            for (Customer customer1 : customers) {
                fileWriter.append(customer1.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getBirthDay());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getNumberCMND());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getNumberPhone());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getTypeOfGuest());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer1.getAddress());
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

    public  void showCustomers() {
        try {
            List<Customer> customers2 = new ArrayList<>();
            FileReader fileReader = new FileReader("FuramaResort/src/data/Customer.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] string = line.split("#");
                Customer customer = new Customer(string[0], string[1], string[2], string[3], string[4], string[5], string[6], string[7]);
                customers2.add(customer);

                Collections.sort(customers2);
                int i=1;
                for (Customer element : customers2
                ) {
                    System.out.println(i+++": "+element.showInfor());
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Scanner scanner = new Scanner(System.in);

    public static String inputUserName() throws UserException {
        while (true) {
            try {
                System.out.println("moi ban nhap ten khach hang");
                final String USER_NAME = "^(\\b[A-Z]{1}[a-z]+)+(( )([A-Z]{1}[a-z]+\\b))*?$";
                String userName = scanner.nextLine();
                Pattern pattern = Pattern.compile(USER_NAME);
                Matcher matcher = pattern.matcher(userName);
                if (matcher.matches()) {
                    return userName;
                } else {
                    throw new UserException();
                }
            } catch (UserException user) {
                user.NameException();
            }
        }
    }

    public static String inputUserEmail() throws UserException {
        while (true) {
            try {
                System.out.println("moi ban nhap ten Email khach hang");
                final String USER_MAIL = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
                String userEmail = scanner.nextLine();
                Pattern pattern = Pattern.compile(USER_MAIL);
                Matcher matcher = pattern.matcher(userEmail);
                if (matcher.matches()) {
                    return userEmail;
                } else {
                    throw new UserException();
                }
            } catch (UserException user) {
                user.EmailException();
            }
        }
    }

    public static String inputUserGender() throws UserException {
        while (true) {
            try {
                System.out.println("moi ban nhap gioi tinh cua khach hang");
                final String USER_GENDER = "^[Mm]{1}+[Aa]{1}+[Ll]{1}+[Ee]{1}|[Ff]{1}+[Ee]{1}+[Mm]{1}+[Aa]{1}+[Ll]{1}+[Ee]{1}|[Uu]{1}+[Nn]{1}+[Kk]{1}+[Nn]{1}+[Oo]{1}+[Ww]{1}$";
                String userGender = scanner.nextLine();
                Pattern pattern = Pattern.compile(USER_GENDER);
                Matcher matcher = pattern.matcher(userGender);
                if (matcher.matches()) {
                    return userGender.toLowerCase();
                } else {
                    throw new UserException();
                }
            } catch (UserException user) {
                user.GenderException();
            }
        }
    }

    public static String inputUserIdCard() throws UserException {
        while (true) {
            try {
                System.out.println("moi ban nhap chung minh nhan dan cua khach hang");
                final String USER_ID = "^[0-9]{3}( )[0-9]{3}( )[0-9]{3}$";
                String userId = scanner.nextLine();
                Pattern pattern = Pattern.compile(USER_ID);
                Matcher matcher = pattern.matcher(userId);
                if (matcher.matches()) {
                    return userId;
                } else {
                    throw new UserException();
                }
            } catch (UserException user) {
                user.IdCardException();
            }
        }
    }

    public static String inputUserBirthDay() throws UserException {
        while (true) {
            try {
                System.out.println("moi ban nhap ngay sinh cua khach hang");
                final String USER_BIRTHDAY = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/((19[0-9]{2})|(200[0-3]))$";
                String userBrithday = scanner.nextLine();
                Pattern pattern = Pattern.compile(USER_BIRTHDAY);
                Matcher matcher = pattern.matcher(userBrithday);
                if (matcher.matches()) {
                    return userBrithday;
                } else {
                    throw new UserException();
                }
            } catch (UserException user) {
                user.BirthdayException();
            }
        }
    }
}

package bai_tap;

import java.util.Scanner;

public class Tinh_lai {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner scanner=new Scanner(System.in);
        System.out.println("số liền vay");
        money=scanner.nextDouble();
        System.out.println("nhập số tháng vay");
        month=scanner.nextInt();
        System.out.println("nhập hệ số lãi suất");
        interestRate=scanner.nextDouble();
        double totalInterest=0;
        for (int i=0;i<month;i++){
            totalInterest=money*(interestRate/100)/12*month;
        }
        System.out.println(totalInterest);
    }
}

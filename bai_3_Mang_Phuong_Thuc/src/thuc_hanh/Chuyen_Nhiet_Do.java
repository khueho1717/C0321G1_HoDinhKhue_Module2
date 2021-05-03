package thuc_hanh;

import java.util.Scanner;

public class Chuyen_Nhiet_Do {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int doC;
        int doF;
        int choice;
        do {
            System.out.println("lua chon chuyen doi");
            System.out.println("1.chuyen tu do F sang do C");
            System.out.println("2.chuyen tu do C sang do F");
            System.out.println("0.thoat");
            System.out.println("nhap vao de chuyen doi");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhap do F");
                    doF=scanner.nextInt();
                    System.out.println("do C la: "+ fToC(doF));
                    break;
                case 2:
                    System.out.println("nhap do C");
                    doC=scanner.nextInt();
                    System.out.println("do F la: "+cToF(doC));
                    break;
                case 3:
                    choice=0;
            }

        }while (choice!=0);
    }
    public static double cToF(double doC){
        double doF= (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fToC(double doF){
        double doC=(5.0 / 9) * (doF - 32);
        return doC;
    }
}

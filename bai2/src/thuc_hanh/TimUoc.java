package thuc_hanh;

import java.util.Scanner;

public class Tim_Uoc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap so a");
        a=scanner.nextInt();
        System.out.println("nhap so b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0||b==0){
            System.out.println("khong phai la uoc");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("uoc lon nhat :"+a);
    }
}

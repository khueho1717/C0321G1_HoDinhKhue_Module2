package bai_tap;

import java.util.Scanner;

public class Dem_Ki_Tu {
    public static void main(String[] args) {
        String str="hello world";
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập một kí tự để kiểm tra số lần xuất hiện trong chuỗi");
        char check=scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==check){
                count++;
            }
        }
        System.out.println("số kí tự "+check+" xuất hiện trong chuỗi là: "+count);
    }
}

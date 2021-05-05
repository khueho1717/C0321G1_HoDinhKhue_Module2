package thuc_hanh;

import java.util.Scanner;

public class Dem_Sv_Thi_Do {
    public static void main(String[] args) {
        int size;
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        do {
            System.out.println("nhap so luong sinh vien");
            size=scanner.nextInt();
            if (size>30){
                System.out.println("nhap so luong it hon");
            }
        }while (size>30);
        arr=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("nhap hoc sinh thu "+(i+1));
            arr[i]=scanner.nextInt();
        }
        int count=0;
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
            if (arr[j]>=5&&arr[j]<=10){
                count++;
            }
        }
        System.out.println("so sinh vien thi dau la "+count);
    }
}

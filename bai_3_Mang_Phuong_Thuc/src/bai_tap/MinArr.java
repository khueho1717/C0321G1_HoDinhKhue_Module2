package bai_tap;

import java.util.Scanner;

public class Min_Arr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap so phan tu trong mang");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("nhap phan tu thu "+(i+1)+" ");
            arr[i]=scanner.nextInt();
        }
        System.out.printf("phan thu trong mang"+" ");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print("phan tu nho nhat trong mang la: "+min);
    }
}


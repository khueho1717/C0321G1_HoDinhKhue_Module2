package bai_tap;

import java.util.Scanner;

public class Max_Arr_2c {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang trong mang 2 chieu");
        int row=scanner.nextInt();
        System.out.println("nhap so cot trong mang hai chieu");
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("nhap phan tu "+(i+1)+" thu"+(j+1));
                arr[i][j]=scanner.nextInt();
            }
        }
        int max=arr[0][0];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang la: "+max);
    }
}

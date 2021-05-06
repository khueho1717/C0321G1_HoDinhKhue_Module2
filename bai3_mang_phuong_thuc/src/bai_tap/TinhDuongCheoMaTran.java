package bai_tap;

import java.util.Scanner;

public class Tinh_Duong_Cheo_Ma_Tran {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang");
        int row=scanner.nextInt();
        int col=row;
        int count=0;
        float[][] arr=new float[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("nhap phan tu hang "+(i+1)+" thu "+(j+1));
                arr[i][j]=scanner.nextFloat();
                if (i==j){
                    count+=arr[i][j];
                }
            }
        }
        System.out.println("tổng đuongwf chéo trong mảng là "+count);
    }
}

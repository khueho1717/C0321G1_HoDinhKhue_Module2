package bai_tap;

import java.util.Scanner;

public class Total_Col {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so hang");
        int row=scanner.nextInt();
        System.out.println("nhap so cot");
        int col=scanner.nextInt();
        float[][] arr=new float[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("nhap phan tu hang "+(i+1)+" thu "+(j+1));
                arr[i][j]=scanner.nextFloat();
            }
        }
        int count=0;
        for (int i=0;i<=row;i++){
            for (int j=0;j<=col-1;j++){
                count+=arr[i][j];
                if (j==col-1){
                    System.out.println("tong các phần tử trong hàng "+(i+1)+" là "+count);
                    count=0;
                }
            }
        }
    }
}

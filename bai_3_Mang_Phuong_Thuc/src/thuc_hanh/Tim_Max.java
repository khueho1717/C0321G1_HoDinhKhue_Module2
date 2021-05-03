package thuc_hanh;

import java.util.Scanner;

public class Tim_Max {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap so luong phan tu trong mang");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("so luong qua nhieu");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("nhap phan tu "+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("so phan tu trong mang");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=0;
        for (int j=0;j<array.length;j++){
            if (max<array[j]){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("gia tri lon nhat trong mang la: "+max+" tai phan tu thu: "+index);
    }
}

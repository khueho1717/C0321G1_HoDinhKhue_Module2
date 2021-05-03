package bai_tap;

import java.util.Scanner;

public class Them_Phan_Tu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so phan tu trong mang");
        int lenghtArr=scanner.nextInt();
        int[] arr=new int[lenghtArr];
        arr[0]=10;
        arr[1]=4;
        arr[2]=3;
        arr[3]=6;
        arr[4]=8;
        int[] arrNew=new int[lenghtArr+1];
        System.out.println("nhap so can chen");
        int num=scanner.nextInt();
        System.out.println("nhap vi tri can chen");
        int index1=scanner.nextInt();
        for (int i=0;i<arrNew.length;i++){
            if (index1==i){
                arrNew[index1]=num;
                break;
            }else {
                arrNew[i]=arr[i];
            }
        }
        for (int index2=index1+1;index2<arrNew.length;index2++){
            arrNew[index2]=arr[index2-1];
        }
        for (int i=0;i<=arrNew.length;i++){
            System.out.print(arrNew[i]+"\t");
        }
    }

}

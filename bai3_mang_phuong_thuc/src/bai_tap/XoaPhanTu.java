package bai_tap;

import java.util.Scanner;

public class Xoa_Phan_Tu {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 76, 4, 3, 4, 7, 8, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can xoa trong mang");
        int num = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                check = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        if (check) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        } else {
            System.out.println("so nay khong nam trong mang");
        }
    }
}

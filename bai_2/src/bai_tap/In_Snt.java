package bai_tap;

import java.util.Scanner;

public class In_Snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập lượng số nguyên tố để in ra");
        int number = scanner.nextInt();
        int count = 0;
        boolean check = true;
        while (check) {
            for (int n = 2; n > 0; n++) {
                if (n == 2) {
                    System.out.println(n);
                    count++;
                }
                for (int j = 2; j <= n; j++) {
                    if (n % j != 0) {
                        System.out.println(n);
                        count++;
                    }

                }
            }
            if (count == number) {
                check = false;
            }
        }
    }
}

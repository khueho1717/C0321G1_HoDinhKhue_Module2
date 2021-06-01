package commons;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookingTickets {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<String>();

    {
    }

    public static void main(String[] args) {
//        System.out.println();
        bookingTicket();
    }

    public static void bookingTicket() {
        System.out.println("chọn 1: để mua vé");
        System.out.println("chọn 2: để xem danh sách người đã đặt");
        System.out.println("Chọn 3.Exit");
        int choise=Integer.parseInt(scanner.nextLine());
        boolean check=true;
        while (check){
            switch (choise){
                case 1:
                    System.out.println("nhập họ và tên ");
                    String name = scanner.nextLine();
                    queue.offer(name);
                    bookingTicket();
                    check=false;
                    break;
                case 2:
                    String current;
                    int slot = 1;
                    while ((current = queue.poll()) != null) {
                        System.out.println(current + ", vị trí ghê: " + slot++);
                    }
                    bookingTicket();
                    check=false;
                    break;
                case 3:
                    check=false;
            }

        }
    }

}

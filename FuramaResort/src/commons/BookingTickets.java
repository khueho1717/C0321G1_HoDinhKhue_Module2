package commons;

import controllers.MainController;

import java.io.IOException;
import java.util.*;

public class BookingTickets {
    static Scanner scanner = new Scanner(System.in);
    static List<String> list = new ArrayList<>();
    static int count = 10;
    static MainController mainController = new MainController();

    public static void main(String[] args) throws IOException, UserException {
        bookingTicket();
    }

    public static void bookingTicket() throws IOException, UserException {
        System.out.println("chọn 1: để mua vé");
        System.out.println("chọn 2: để xem danh sách người đã đặt");
        System.out.println("Chọn 3.Exit");
        int choise = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        while (check) {
            switch (choise) {
                case 1:
                    inputName();
                    bookingTicket();
                    check = false;
                    break;
                case 2:
                    showTickets();
                    bookingTicket();
                    break;
                case 3:
                    mainController.disPlayMenu();
                    check = false;
            }

        }
    }

    public static void showTickets() {
        Queue<String> queue = new LinkedList<String>();
        String current2;
        int slot2 = 1;
        for (String e : list
        ) {
            queue.offer(e);
        }
        while ((current2 = queue.poll()) != null) {
            System.out.println(current2 + ", vị trí ghê: " + slot2++);
        }
    }

    public static void inputName() {
        if (count > 0) {
            System.out.println("nhập họ và tên ");
            String name = scanner.nextLine();
            list.add(name);
            count--;
        } else {
            System.out.println("đã hết vé xem phim cảm ơn quý khách!!!!");
        }
        System.out.println("số vé còn lại: " + count);
    }
}

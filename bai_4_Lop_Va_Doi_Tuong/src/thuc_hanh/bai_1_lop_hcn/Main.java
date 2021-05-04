package thuc_hanh.bai_1_lop_hcn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chièu rộng hình chữ nhật");
        double width=scanner.nextDouble();
        System.out.println("nhập chiều dài hình chữ nhật");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("hình chữ nhật của bạn có: "+rectangle.disPlay());
        System.out.println("Diện tích hình chữ nhật là: "+rectangle.getArea());
        System.out.println("chu vi hình chữ nhật "+rectangle.getPerimeter());
    }
}

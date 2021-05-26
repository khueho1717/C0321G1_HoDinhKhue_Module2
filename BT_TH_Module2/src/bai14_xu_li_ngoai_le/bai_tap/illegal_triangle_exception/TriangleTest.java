package bai14_xu_li_ngoai_le.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try {
                System.out.println("nhập cạnh thứ nhất:");
                int side1=Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạch thứ hai:");
                int side2=Integer.parseInt(scanner.nextLine());
                System.out.println("nhập csnhj thứ ba:");
                int side3=Integer.parseInt(scanner.nextLine());
                Triangle triangle=new Triangle(side1,side2,side3);
                System.out.println(triangle);
            } catch (NumberFormatException side) {
                System.err.println(side.getMessage());
                System.err.println("giá trị nhập vào không phải là số!!! mời nhâpọ lại");

            }catch (IllegalTriangleException e){
                System.err.println(e.getMessage());
                System.err.println("mời nhập lại!!!");
            }
        }
    }
}

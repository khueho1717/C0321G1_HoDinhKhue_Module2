package bai6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap canh thu 1 tam giac: ");
        double a=scanner.nextDouble();
        System.out.println("nhap canh thu 2 tam giac: ");
        double b=scanner.nextDouble();
        System.out.println("nhap canh thu 3 tam giac: ");
        double c=scanner.nextDouble();
        triangle.setSide1(a);
        triangle.setSide2(b);
        triangle.setSide3(c);
        System.out.println(triangle);
    }
}

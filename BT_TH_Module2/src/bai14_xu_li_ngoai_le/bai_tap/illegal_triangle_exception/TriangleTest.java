package bai14_xu_li_ngoai_le.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleTest {
    public static double triangle(double side1, double side2, double side3) {

        if (side1 <= 0 || (side1 + side2) < side3 || (side1 + side3) < side2) {
            throw new IllegalArgumentException("Invalid Triangle Side Numbers");
        } else if (side2 <= 0 || (side2 + side3) < side1) {

            throw new IllegalArgumentException("Invalid Triangle Side Numbers");
        } else if (side3 <= 0) {

            throw new IllegalArgumentException("Invalid Triangle Side Numbers");
        } else {

            throw new IllegalArgumentException("Valid Triangle Side Numbers");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Side of trangle");
        System.out.println("side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("side3: ");
        double side3 = scanner.nextDouble();
        try {

            double result = triangle(side1, side2, side3);

            System.out.println("Valid triangle sides");


        } catch (Exception e) {

            System.out.println("Exception: Invalid Triangle Side Numbers");

        }

        System.out.println("Exception continues......");


    }
}

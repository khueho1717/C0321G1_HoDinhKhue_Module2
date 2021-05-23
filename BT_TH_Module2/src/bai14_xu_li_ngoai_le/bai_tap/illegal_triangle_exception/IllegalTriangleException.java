package bai14_xu_li_ngoai_le.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    protected double side1;

    protected double side2;

    protected double side3;
    public void message(){
        System.out.println("Valid Triangle Side Numbers");
    }

}

package bai7_abstraction_interface.bai_tap.interface_resizeable;

import bai6_inheritance.bai_tap.circle_circlenin.Circle;

import java.awt.*;


public class ShapeTest {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(3.5);
        Rectangle2 rectangle2 = new Rectangle2();
        Square2 square2 = new Square2();
        double[] shapeTests = new double[3];
        System.out.println("day la kich thuoc cua doi tuong khi chua thay doi hinhkich thuoc");
        shapeTests[0] = circle2.getArea();
        shapeTests[1] = rectangle2.getArea();
        shapeTests[2] = square2.getArea();
        for (double shape : shapeTests
        ) {
            System.out.println(shape);
        }
        System.out.println("day la kich thuoc cua doi tuong khi da thay doi hinh kich thuoc");
        for (double shape : shapeTests
        ) {
            System.out.println(Math.round(shape*circle2.rezise(Math.random()*100)));
        }
    }
}

package bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        circle.setColor("red");
        System.out.println(circle);

        circle = new Circle(3.5, "blue", false);
        System.out.println(circle);
    }
}

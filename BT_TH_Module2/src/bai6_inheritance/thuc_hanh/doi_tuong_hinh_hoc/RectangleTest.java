package bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(3.4,5.8);
        System.out.println(rectangle);
        rectangle=new Rectangle(4,6,"orange",true);
        System.out.println(rectangle);
    }
}

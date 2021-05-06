package bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        shape=new Shape("red",true);
        System.out.println(shape);
    }
}

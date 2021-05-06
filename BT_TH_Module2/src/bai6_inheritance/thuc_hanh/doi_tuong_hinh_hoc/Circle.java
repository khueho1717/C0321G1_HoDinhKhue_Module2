package bai6_inheritance.thuc_hanh.doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}

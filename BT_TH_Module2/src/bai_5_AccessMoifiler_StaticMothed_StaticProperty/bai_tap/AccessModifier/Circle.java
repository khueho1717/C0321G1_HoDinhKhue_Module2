package bai_5_AccessMoifiler_StaticMothed_StaticProperty.bai_tap.AccessModifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }
    public Circle(){
        radius=1;
        color="red";
    }
    public double area(){
        return (radius*radius*Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("diện tích hình tròn có bán kính: "+circle.getRadius()+" là "+circle.area());
    }
}

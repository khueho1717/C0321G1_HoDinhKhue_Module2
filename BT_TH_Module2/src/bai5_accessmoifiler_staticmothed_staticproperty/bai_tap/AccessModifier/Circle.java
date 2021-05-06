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
}

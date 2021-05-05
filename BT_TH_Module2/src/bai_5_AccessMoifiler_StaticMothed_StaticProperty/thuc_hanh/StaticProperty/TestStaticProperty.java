package bai_5_AccessMoifiler_StaticMothed_StaticProperty.thuc_hanh.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda3","Skyacty 3");
        System.out.println(Car.numberOfCar());
        Car car2=new Car("Mazda6","Skyacty 6");
        System.out.println(Car.numberOfCar());
    }
}

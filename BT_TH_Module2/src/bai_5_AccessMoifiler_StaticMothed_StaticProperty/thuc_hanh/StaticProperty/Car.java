package bai_5_AccessMoifiler_StaticMothed_StaticProperty.thuc_hanh.StaticProperty;

public class Car {
    private String name;
    private String engine;
    private static int numberOfCar;

    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;

    }

    public static int numberOfCar() {
         numberOfCar++;
         return numberOfCar;
    }
}

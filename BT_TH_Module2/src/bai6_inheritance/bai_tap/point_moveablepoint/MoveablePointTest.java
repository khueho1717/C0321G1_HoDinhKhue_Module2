package bai6_inheritance.bai_tap.point_moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(1,2,3,2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}

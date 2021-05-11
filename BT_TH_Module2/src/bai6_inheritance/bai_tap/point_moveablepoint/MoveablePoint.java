package bai6_inheritance.bai_tap.point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Object getSpeed(float xSpeed, float ySpeed) {
        Object[] speed = new Object[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "speed=(" + getSpeed(xSpeed, ySpeed) + ")";
    }

    public String move() {
        this.setX(getX() + xSpeed);
        this.setY(getY() + ySpeed);
        return toString();
    }
}

package bai6_inheritance.bai_tap.point_moveablepoint;

public class Point {
    private float x=0;
    private float y=0;

    public Point(){
    }
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Object getXY(float x, float y){
        Object[] xy=new Object[2];
        xy[0]=x;
        xy[1]=y;
        return xy[0]+","+xy[1];
    }

    @Override
    public String toString() {
        return "tọa độ của point2d "+"("+getXY(getX(),getY())+")";
    }
}

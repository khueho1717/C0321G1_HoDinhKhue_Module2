package bai6_inheritance.bai_tap.point2d_point3d;

public class Point3d extends Point2d {
    private float z=0;
    public Point3d(){}
    public Point3d(float z){
        this.z=z;
    }
    public Point3d(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public Object getXYZ(float x,float y,float z){
        Object[] xyz=new Object[3];
        xyz[0]=x;
        xyz[1]=y;
        xyz[2]=y;
        return xyz;
    }

    @Override
    public String toString() {
        return "tọa độ của point3d "+"("+getXYZ(getX(),getY(),getZ())+")";
    }
}

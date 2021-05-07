package bai_tap_1_giai_pt2;

import java.util.Scanner;

public class PTBac2 {
    private double a;
    private double b;
    private double c;

    public PTBac2() {
    }

    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }

    public double getC() {
        return c;
    }
    public double nhapSo(){
        double so;
        Scanner scanner=new Scanner(System.in);
        so=scanner.nextDouble();
        return so;
    }
    void nhapPT(){
        System.out.println("moi ban nhap puong trinh bac 2 can giai");
        System.out.println("nhap so a");
        a=nhapSo();
        System.out.println("nhap so b");
        b=nhapSo();
        System.out.println("nhap so c");
        c=nhapSo();
    }
    public double getDiscriminant(){
        double delta;
        delta=Math.pow(getB(),2)-4*getA()*getC();
        return delta;
    }
    public double getRootDouble(){
        double x1;
        x1=-getB()/(2*getA());
        return x1;
    }
    public double getRootOnly(){
        double x1;
        x1=-getC()/getB();
        return x1;
    }
    public double getRoot1(){
        double x1;
        x1=((-getB()+Math.sqrt(getDiscriminant()))/(2*getA()));
        return x1;
    }
    public double getRoot2(){
        double x1;
        x1=((-getB()-Math.sqrt(getDiscriminant()))/(2*getA()));
        return x1;
    }
    public void kiemTra(){
        if (getA()==0){
            if (getB()==0){
                System.out.println("phương trình vô nghiệm");
            }else {
                System.out.println("phương trình có nghiệm duy nhất: "+getRootOnly());
            }
        }else {
            if (getDiscriminant()<0){
                System.out.println("phương trình vô nghiệm");
            }else {
                if (getDiscriminant()==0){
                    System.out.println("phương trình có nghiệm kép: "+getRootDouble());
                }else {
                    System.out.println("phương trình có hai nghiệm phân biệt");
                    System.out.println("x1: "+getRoot1());
                    System.out.println("x2: "+getRoot2());
                }
            }
        }
    }
}


package bai14_xu_li_ngoai_le.thuc_hanh.number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so x");
        int x=scanner.nextInt();
        System.out.println("nhap so y");
        int y=scanner.nextInt();
        CalculationExample calculationExample=new CalculationExample();
        calculationExample.calculate(x,y);
    }
    private void calculate(int x,int y){
        try {
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("tong x va y = "+a);
            System.out.println("hieu x va y = "+b);
            System.out.println("tich x va y = "+c);
            System.out.println("thuong x va y = "+d);
        }catch (Exception e){
            System.out.println("xay ra ngoai le: "+e.getMessage());
        }
    }
}

package bai14_xu_li_ngoai_le.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws IllegalArgumentException{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("moi nhap ba canh cua mot tam giac");
            System.out.println("nhap canh thu nhat");
            int firstEdge = scanner.nextInt();
            System.out.println("canh thu hai");
            int secondEge = scanner.nextInt();
            System.out.println("nhap canh thu ba");
            int finalEdge = scanner.nextInt();
            if (firstEdge <= 0 || secondEge <= 0 || finalEdge <= 0) {
                System.err.println("InvalidInput");
            } else if (firstEdge >= (secondEge + finalEdge) || finalEdge >= (secondEge + firstEdge) || secondEge >= (firstEdge + finalEdge)) {
                System.err.println("Not a Triangle");
            }else {
                System.out.println("this is triangle");
            }
        }catch (Exception e){
            throw new IllegalArgumentException("erro: enter a number");
        }
    }

}

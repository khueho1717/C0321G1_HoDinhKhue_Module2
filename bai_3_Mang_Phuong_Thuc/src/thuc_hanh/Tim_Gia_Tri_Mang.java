package thuc_hanh;

import java.util.Scanner;

public class Tim_Gia_Tri_Mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten hoc sinh");
        String name=scanner.nextLine();
        boolean check=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(name)){
                System.out.println("vi tri cua hoc sinh co trong danh sach: "+name+" la: "+(i+1));
                check=true;
                break;
            }
        }
        if (!check){
            System.out.println("ten "+name+" khong nam trong danh sach");
        }
    }
}

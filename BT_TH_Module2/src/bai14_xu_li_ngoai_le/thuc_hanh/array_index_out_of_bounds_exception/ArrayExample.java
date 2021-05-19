package bai14_xu_li_ngoai_le.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] array=new Integer[100];
        System.out.println("danh sach phan tu cua mang: ");
        for (int i=0;i<100;i++){
            array[i]=random.nextInt(100 );
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("vi long nhao chi co cua mot phan tu bat ki");
        int num=scanner.nextInt();
        try {
            System.out.println("gia tri chu chi so "+num+" la "+arr[num]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("chi so vuot quau gioi han cua mang");
        }
    }
}

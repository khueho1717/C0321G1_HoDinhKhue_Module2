package bai_tap;

public class Gop_Mang {
    public static void main(String[] args) {
        int[] arr1={1,2,4,3,5,4,7,5,4,3};
        int[] arr2={2,3,54,3,5,4,6,7,6,7,8,5};
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
           arr3[i]=arr1[i];
        }
        for (int j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+"\t");
        }
    }
}

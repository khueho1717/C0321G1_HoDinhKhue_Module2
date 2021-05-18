package bai13_thuat_toan_sap_xep.thuc_hanh.sap_xep_noi_bot;

public class BubbleSort {
    static int[] list={1,4,3,2,5,8,-9,7,5,7,98};
    public static void bubbleSort(int[]list){
        boolean neddNextPass=true;
        for (int k=1;k<list.length&&neddNextPass;k++){
            neddNextPass=false;
            for (int i=0;i<list.length-k;i++){
                int temp=list[i];
                list[i]=list[i+1];
                list[i+1]=temp;
                neddNextPass=true;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}

package bai9_dsa_danh_sach.thuc_hanh.simple_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listInteger = new MyList<String>();
        listInteger.add("chào mùa xuân 1");
        listInteger.add("chào mùa xuân 2");
        listInteger.add("chào mùa xuân 3");
        listInteger.add("chào mùa xuân 4");
        listInteger.add("chào mùa xuân 5");

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}

package bai10_dsa_danh_sach.bai_tap.method_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
//        System.out.println(myList.get(0));
//        System.out.println(myList.getSize());
        myList.add(2, 10);
//        System.out.println(myList.get(4));
//        System.out.println(myList.getSize());
        System.out.println(" ");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.remove(2));
//        System.out.println(myList.get(3));
        System.out.println(" ");
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.contains(7));
        System.out.println(myList.contains(2));
        System.out.println(myList.indexOf(6));
//        myList.clear();
        myList.add(11);
//        myList.add(12);
        System.out.println(myList.getSize());
        System.out.println(myList.getClass());
        MyList<Integer> myClone = myList.clone();
        System.out.println(" ");
        for (int i = 0; i < myClone.getSize(); i++) {
            System.out.println(myClone.get(i));
        }
        System.out.println(" ");
        myClone.clear();
        myClone.add(1);
        myClone.add(2);
        System.out.println(myClone.getSize());
        System.out.println(myClone.get(1));
//        myClone.add(2,3);
//        myClone.add(1,2);
        System.out.println(myClone.contains(3));
        System.out.println(myClone.contains(1));
//        myClone.add(1);
        System.out.println(myClone.get(0));
    }
}

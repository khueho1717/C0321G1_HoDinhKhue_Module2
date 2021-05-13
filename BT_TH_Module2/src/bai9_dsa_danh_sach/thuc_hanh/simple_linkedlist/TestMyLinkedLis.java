package bai9_dsa_danh_sach.thuc_hanh.simple_linkedlist;

public class TestMyLinkedLis {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.get(3);
        ll.add(10,34);
        ll.addFirst(2);
        ll.printList();
    }
}

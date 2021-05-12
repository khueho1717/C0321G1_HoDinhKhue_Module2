package bai10_dsa_danh_sach.bai_tap.method_linkedlist;


public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean removeElement(Object e) {
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (temp.data != e) {
                temp = temp.next;

            } else {
                remove(index - 1);
                return true;
            }
            index++;
        }
        return false;
    }

    public int size() {
        Node temp = head;
        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public MyLinkedList clone() {
        return this;
    }

    public boolean contains(Object o) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.data == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (temp.data == o) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        MyLinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

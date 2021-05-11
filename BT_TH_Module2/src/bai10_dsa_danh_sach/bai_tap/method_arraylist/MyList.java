package bai10_dsa_danh_sach.bai_tap.method_arraylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    private void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        if (index < size) {
            for (int temp = size; index < temp; temp--) {
                elements[temp] = elements[temp - 1];
            }
            elements[index] = element;
            size++;
        } else {
            elements[size++] = element;
        }
    }

    public E remove(int index) {
        Object remove = elements[index];
        size--;
        for (; index < size; index++) {
            elements[index] = elements[index + 1];
        }
        return (E) remove;
    }
   public void remove4(int index) {
        int sizeArray = elements.length;
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        sizeArray--;
        Object removeArray[] = new Object[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            removeArray[i] = elements[i];
        }
        for (Object print : removeArray
        ) {
            System.out.print(print+"\t");
        }
    }
    public int getSize() {
        return size;
    }

    public MyList<E> clone() {
        return this;
    }

    public boolean contains(E o) {
        if (size == 0) {
            return false;
        } else {
            for(int i =0;i<size;i++){
                if(elements[i]==o){
                    return true;
                }
            }
        }
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (!contains(e)) {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            elements[size++] = e;
            return true;
        }
        return false;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;

//    void add(int index, E element) {
//        int newSize = elements.length + 1;
//        elements = Arrays.copyOf(elements, newSize);
//        for (int i = newSize; i > index; i--) {
//            if (i == index) {
//                elements[i] = element;
//            } else elements[i] = elements[i - 1];
//            System.out.println(Arrays.toString(elements));
//        }
//        for (int i = 0; i < elements.length; i++) {
//            if (index > elements.length) {
//                System.out.println("vị trí này không nằm trong mảng");
//                break;
//            } else if (i == index) {
//                elementsNew[i] = element;
//                break;
//            } else {
//                elementsNew[i] = elements[i];
//            }
//        }
//        for (int index2 = index + 1; index2 < elementsNew.length; index2++) {
//            elementsNew[index2] = elements[index2 - 1];
//        }
//        elements=elementsNew;
//        for (Object print : elements
//        ) {
//            System.out.print(print+"\t");
//        }


//    void remove(int index) {
//        int sizeArray = elements.length;
//        for (int i = index; i < elements.length - 1; i++) {
//            elements[i] = elements[i + 1];
//        }
//        sizeArray--;
//        Object removeArray[] = new Object[sizeArray];
//        for (int i = 0; i < sizeArray; i++) {
//            removeArray[i] = elements[i];
//        }
//        for (Object print : removeArray
//        ) {
//            System.out.print(print+"\t");
//        }
//    }
//
//    public int size() {
//        return this.size = elements.length;
//    }
//
//    public MyList<E> clone() {
//        return this;
//    }
//
//    public boolean contains(E o) {
//        if (elements.length == 0) {
//            return false;
//        } else {
//            for (int i = 0; i < elements.length; i++) {
//                if (elements[i] == o) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//    public int indexOf(E o){
//        if (elements.length==0){
//            return -1;
//        }else {
//            for (int i = 0; i < elements.length; i++) {
//                if (elements[i] == o) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//    }
//    public boolean add(E o){
//        if (!contains(o)){
//            elements=new Object[size++];
//            add(size,o);
//            return true;
//        }
//        return false;
//    }
//    public void ensureCapacity(int minCapacity) {
//        elements = Arrays.copyOf(elements, minCapacity);
//    }
//    public E get(int i) {
//        if (i >= size || i < 0) {
//            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
//        }
//        return (E) elements[i];
//    }
//
//    public void clear() {
//        elements = new Object[DEFAULT_CAPACITY];
//        size = 0;
//    }
    }
}

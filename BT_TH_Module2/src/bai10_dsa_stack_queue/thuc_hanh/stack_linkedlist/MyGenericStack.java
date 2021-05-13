package bai10_dsa_stack_queue.thuc_hanh.stack_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T elemnt) {
        stack.addFirst(elemnt);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

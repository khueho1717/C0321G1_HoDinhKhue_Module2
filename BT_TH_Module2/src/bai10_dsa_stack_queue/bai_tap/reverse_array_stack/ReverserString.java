package bai10_dsa_stack_queue.bai_tap.reverse_array_stack;

import java.util.Stack;

public class ReverserString {
    public static void reverse(StringBuffer string) {
        int n = string.length();
        Stack stack = new Stack();

        int i;
        for (i = 0; i < n; i++) {
            stack.push(string.charAt(i));
        }
        for (i = 0; i < n; i++) {
            char ch = (char) stack.pop();
            string.setCharAt(i, ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("chào mọi nanci");
        System.out.println(string);
        reverse(string);
        System.out.println("Reversed string is: " + string);
    }
}

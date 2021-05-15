package bai10_dsa_stack_queue.bai_tap.optional_palindrome;

import bai10_dsa_stack_queue.bai_tap.queue.Solution;
import bai10_dsa_stack_queue.thuc_hanh.optional_queue_arraylist.MyQueue;

import java.util.*;
import java.util.Queue;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi kiểm tra đối xứng");
        String string = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString=reverseString+queue.remove();
        }
        if (string.equals(reverseString)){
            System.out.println("chuỗi đối xứng");
        }else {
            System.out.println("đây không ohải là chuỗi đối xứng");
        }
    }
}

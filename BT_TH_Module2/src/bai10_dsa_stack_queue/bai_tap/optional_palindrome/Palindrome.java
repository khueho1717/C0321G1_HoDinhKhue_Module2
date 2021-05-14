package bai10_dsa_stack_queue.bai_tap.optional_palindrome;

import bai10_dsa_stack_queue.bai_tap.queue.Solution;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<string.length();i++){
            stack.push(string.charAt(i));
        }
        System.out.println(stack);
    }
}

package bai10_dsa_stack_queue.thuc_hanh.optional_stack_arraylist;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack=new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
//        stack.push(9);
        stack.pop();
       for (int i = 0; i<stack.size(); i++){
           System.out.println(stack.arr[i]);
       }
//        while (!stack.isEmpty()) {
//            System.out.printf(" %d", stack.pop());
//        }
    }
}

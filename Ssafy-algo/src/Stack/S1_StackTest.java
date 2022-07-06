package Stack;

import java.util.Stack;

public class S1_StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty() + "/" + stack.size());

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack.isEmpty() + "/" + stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        if(!stack.isEmpty()){
            System.out.println(stack.isEmpty() + "/" + stack.size());
        }

    }
}

package LinkedList;

public class LinkedListStackTest {

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();
        System.out.println(stack.isEmpty());
        stack.push("qlek");
        System.out.println(stack);
        stack.push("qlefasdfak");
        System.out.println(stack);
        stack.push("y2345y2ek");
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);


    }
}

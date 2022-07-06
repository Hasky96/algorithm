package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1_QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //ㄴ Queue의 기능만 사용가능, LinkedList 기능 다 못씀

        System.out.println(queue.isEmpty()+"/"+queue.size());

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");

        System.out.println(queue.isEmpty()+"/"+queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty()+"/"+queue.size());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty()+"/"+queue.size());
        System.out.println(queue.peek()); // => 오류 안남, null반환
        System.out.println(queue.poll()); // => 오류 안남, null반환



    }
}

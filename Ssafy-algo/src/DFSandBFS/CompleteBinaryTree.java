package DFSandBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 완전이진트리
public class CompleteBinaryTree {

    private char[] nodes;
    private final int SIZE; // size fix
    private int lastIndex; // index of last node

    public CompleteBinaryTree(int size){
        this.SIZE = size;
        nodes = new char[size+1];
    }

    public void add(char c){
        if(lastIndex == SIZE) return;
        nodes[++lastIndex] = c;
    }

    public void bfs(){
        // wating for search => by index
        Queue<Integer> queue = new LinkedList<Integer>();
        // index of root node
        queue.offer(1);

        int current = 0;
        while(!queue.isEmpty()){
            current = queue.poll();
            System.out.println(nodes[current]);
            // left child
            if(current*2<=lastIndex) queue.offer(current*2);
            // right child
            if(current*2+1<=lastIndex) queue.offer(current*2+1);
        }
    }

    public void bfs2(){
        // wating for search => by index
        Queue<Integer> queue = new LinkedList<Integer>();
        // index of root node
        queue.offer(1);

        int current = 0, level = 0, size = 0;
        while(!queue.isEmpty()) {
            size = queue.size();

            System.out.print("level"+level+":");
            while(--size>=0){
                current = queue.poll();
                System.out.print(nodes[current]+" ");
                // left child
                if(current*2<=lastIndex) queue.offer(current*2);
                // right child
                if(current*2+1<=lastIndex) queue.offer(current*2+1);
            }
            System.out.println();
            ++level;
        }
    }

    // public
    public void dfsByPreOrder(){
        System.out.print("Preorder : ");
        dfsByPreOrder(1);
        System.out.println();
    }
    // overloading - Actual recursive method
    private void dfsByPreOrder(int current){
        // current node
        System.out.print(nodes[current]);
        // maximum two children
        // left child
        if(current*2 <= lastIndex) dfsByPreOrder(current*2);
        // right child
        if(current*2+1 <= lastIndex) dfsByPreOrder(current*2+1);
    }

    public void dfsByInOrder(){
        System.out.print("Preorder : ");
        dfsByInOrder(1);
        System.out.println();
    }
    private void dfsByInOrder(int current){
        // maximum two children
        // left child
        if(current*2 <= lastIndex) dfsByInOrder(current*2);
        // current node
        System.out.print(nodes[current]);
        // right child
        if(current*2+1 <= lastIndex) dfsByInOrder(current*2+1);
    }


    public void dfsByPostOrder(){
        System.out.print("Preorder : ");
        dfsByPostOrder(1);
        System.out.println();
    }
    private void dfsByPostOrder(int current){
        // maximum two children
        // right child
        if(current*2+1 <= lastIndex) dfsByPostOrder(current*2+1);
        // current node
        System.out.print(nodes[current]);
        // left child
        if(current*2 <= lastIndex) dfsByPostOrder(current*2);
    }

}

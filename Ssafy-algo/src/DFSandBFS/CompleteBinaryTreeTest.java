package DFSandBFS;

public class CompleteBinaryTreeTest {

    public static void main(String[] args) {
        int size = 9;
        CompleteBinaryTree tree = new CompleteBinaryTree(size);

        for(int i = 0 ; i < size; i++){
            tree.add((char)(65+i));
        }
        // 0 1 2 3 4 5 6 7 8 9
        //   a b c d e f g h i
        tree.bfs();
        tree.bfs2();
        tree.dfsByPreOrder();
        tree.dfsByInOrder();
        tree.dfsByPostOrder();

    }
}

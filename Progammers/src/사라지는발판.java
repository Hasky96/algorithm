public class 사라지는발판 {

    static int[][] board;
    static int[] aloc;
    static int[] bloc;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        int[][] boar= {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[] alo = {1, 0};
        int[] blo = {1, 2};
        System.out.println(solution(boar, alo, blo));
    }

    public static int solution(int[][] board, int[] aloc, int[] bloc) {
        int answer = 0;

        while(!move()){
            



        }

        return answer;
    }

    public static boolean move(){


        return true;
    }
}

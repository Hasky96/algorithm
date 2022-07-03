package problems;

import java.util.*;

public class 사라지는발판_try1 {

    static int[][] map;
    static boolean[][] isDisappear;
    static int[] a;
    static int[] b;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean isATurn = true;
    static String loser = "";
    static int answer = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[][] boar= {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[] alo = {1, 0};
        int[] blo = {1, 2};
        System.out.println(solution(boar, alo, blo));
    }

    public static int solution(int[][] board, int[] aloc, int[] bloc) {
        map = board;
        isDisappear = new boolean[board.length][board[0].length];
        a = aloc;
        b = bloc;

        dfs(1);
        System.out.println(list);
        return answer;
    }


    public static void dfs(int turn) {
        System.out.println("turn : " + turn);
        System.out.println(isATurn);
        System.out.println(Arrays.deepToString(isDisappear));
        System.out.print(Arrays.toString(a) + " ");
        System.out.println(Arrays.toString(b));
        // 누군가 갈곳이 없다.
        if (isDisappear[a[0]][a[1]] || isDisappear[b[0]][b[1]]) {
            if (isATurn) loser = "a";
            else loser = "b";
        }
        if (!loser.isBlank()) {
            list.add(turn);
            System.out.println("loser:" + loser);
            System.out.println("count:" + turn);
            if (loser.equals("b") && turn > answer) {
                answer = turn;
            }
            loser = "";
            return;
        }
        // 턴수 증가
        int[] loc;
        if (isATurn) {
            loc = a;
        } else {
            loc = b;
        }

        // 상0 하1 좌2 우3
        System.out.println(Arrays.toString(loc));
        Queue<int[]> Q = new PriorityQueue<>();
        for (int i = 0; i < 4; i++) {
            if (isATurn) {
                //a차례
                Q = new PriorityQueue<>(new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        double dis1 = getDis(o1, b);
                        double dis2 = getDis(o2, b);
                        if (dis1 > dis2) return 1;
                        else if (dis1 < dis2) return -1;
                        return 0;
                    }
                });
            } else {
                //b차례
                Q = new PriorityQueue<>(new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        double dis1 = getDis(o1, a);
                        double dis2 = getDis(o2, a);
                        if (dis1 > dis2) return -1;
                        else if (dis1 < dis2) return 1;
                        return 0;
                    }
                });
            }
            int nx = loc[0] + dx[i];
            int ny = loc[1] + dy[i];
            if (0 <= nx && nx < map.length && 0 <= ny && ny < map.length && !isDisappear[nx][ny]) {
                Q.offer(new int[]{nx, ny});
            }
        }
        //
        for(int[] i: Q){
            System.out.print("QQQQ:");
            System.out.println(Arrays.toString(i));
        }

        //
        if (Q.isEmpty()) {
            // 갈 곳이 없다.
            if (isATurn) {
                isATurn = false;
                loser = "A";
            } else {
                isATurn = true;
                loser = "B";
            }
            dfs(turn);
            return;
        }
        int[] temp = Q.poll();
        int nx = temp[0], ny = temp[1];
        //지금 발판 사라짐
        isDisappear[loc[0]][loc[1]] = true;
        //이동함
        if (isATurn) {
            a = new int[]{nx, ny};
            isATurn = false;
        } else {
            b = new int[]{nx, ny};
            isATurn = true;
        }
        dfs(turn + 1);
        return ;
    }
    public static double getDis(int[] a, int[] b){
        double dis;
        dis = (Math.sqrt(Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1])));

        return dis;
    }
}

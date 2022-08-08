import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj11651_coordinateSorting {

    public static class Coord implements Comparable<Coord>{
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coord o) {
            if(this.y < o.y){
                return -1;
            }else if (this.y > o.y) return 1;
            else {
                if(this.x < o.x){
                    return -1;
                }else if (this.x > o.x) return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return  x +
                    " " + y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        Coord[] list = new Coord[N];
        StringTokenizer st;
        while (--N>=0){
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[N] = new Coord(x, y);
        }
        Arrays.sort(list);
        for (Coord co : list) {
            System.out.println(co.toString());
        }
    }
}

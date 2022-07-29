import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj7568_choby {
    static class Human implements Comparable<Human>{
        int height;
        int weight;

        public Human(int weight, int height) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Human o) {
            if(this.height>o.height && this.weight>o.weight) return 1;
            else if(this.height<o.height && this.weight<o.weight) return -1;
            return 0;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        Human[] arr = new Human[N];

        StringTokenizer st = null;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine());
            arr[i] = new Human(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if(i==j) continue;
                if(arr[i].compareTo(arr[j])==-1){
                    cnt++;
                }
            }
            System.out.print(++cnt + " ");
        }

    }
}

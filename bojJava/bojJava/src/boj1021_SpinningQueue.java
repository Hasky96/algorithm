import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1021_SpinningQueue {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

//        ArrayList<sq> list = new ArrayList<sq>();
        int length = N;
        sq firstSq = new sq(1,null);
        sq prev = firstSq;
        for (int i = 2; i <= N; i++) {
            sq curr = new sq(i, null);
            prev.setNext(curr);
            prev = curr;
        }
        prev.setNext(firstSq);

        st = new StringTokenizer(input.readLine());
        int cnt = 0;
        int ans = 0;
        sq now = firstSq;
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            while(now.getValue() != target){
                cnt+=1;
                prev=now;
                now = now.getNext();
            }
            now = now.getNext();
            now.pull(prev,now);
            if(length/2.0 < cnt) cnt = Math.abs(length-cnt);
            ans+=cnt;
            cnt=0;
            length--;
        }
        System.out.println(ans);
    }

    public static class sq{
        private int value;
        private sq next;

        public sq(int value, sq next){
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }

        public sq getNext(){
            return this.next;
        }

        public void pull(sq prev, sq next){
            prev.setNext(next);
        }

        public void setNext(sq next) {
            this.next = next;
        }
    }
}

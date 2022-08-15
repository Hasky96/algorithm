import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj1764_janeDoe {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < N+M; i++) {
            String name = in.readLine();
            list.put(name, list.getOrDefault(name, 0) + 1);
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();
        for(String name: list.keySet()){
            if(list.get(name)>1){
                cnt++;
                arrayList.add(name);
            }
        }
        arrayList.sort(String::compareTo);
        System.out.println(cnt);
        arrayList.stream().sorted().forEach(x -> System.out.println(x));
    }

}
// Jane Doe & John Doe => 시원미상의 변사체 (여성, 남성)
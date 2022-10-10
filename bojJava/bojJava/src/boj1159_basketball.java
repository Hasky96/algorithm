import java.util.*;
import java.util.stream.Collectors;

public class boj1159_basketball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str =sc.next();
            str = String.valueOf(str.charAt(0));
            map.put(str, map.getOrDefault(str,0) + 1);
        }

        List<String> list = map.keySet().stream().sorted().collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for(String tmp : list){
            if(map.get(tmp) >= 5){
                sb.append(tmp);
            }
        }

        if(sb.length()==0) System.out.println("PREDAJA");
        else System.out.println(sb.toString());
    }
}

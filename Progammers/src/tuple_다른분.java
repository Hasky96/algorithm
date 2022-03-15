import java.util.*;

public class tuple_다른분 {

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        Set<String> set = new HashSet<>();
        System.out.println(s.replaceAll("[{]", " ").replaceAll("[}]", " "));
        System.out.println(s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim());
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}

/*
import java.util.*;

*/

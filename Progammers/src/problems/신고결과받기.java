package problems;

import java.util.*;

public class 신고결과받기 {

    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] id_list = {"con", "ryan"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reported = new HashMap();
        Map<String, Integer> ans = new HashMap<String, Integer>();
        for(String id: id_list){
            reported.put(id, new HashSet<String>());
            ans.put(id, 0);
        }

        for(String repo : report){
            String[] result = repo.split(" ");
            reported.get(result[1]).add(result[0]);
        }

        for(int i =0; i<id_list.length;i++){
            if(reported.get(id_list[i]).size() >= k){
                for(String id : reported.get(id_list[i])){
                    ans.replace(id,ans.get(id), ans.get(id)+1);
                }
            }
        }
        System.out.println(ans);
        for(int i =0;i<ans.size();i++){
            answer[i] = ans.get(id_list[i]);
        }

        return answer;
    }

}

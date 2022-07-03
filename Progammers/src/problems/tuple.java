package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class tuple {

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {

        s = s.substring(2, s.length()-2);
//        System.out.println(s);

        String tmp = "";
        ArrayList myList = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '}') {
                i += 2;
                myList.add(tmp);
                tmp = "";
                continue;
            }
            tmp += s.charAt(i);
        }
        myList.add(tmp);
//        System.out.println(myList.toString());

        myList.sort(Comparator.comparing(x->x.toString().length()));
        int[] answer = new int[myList.size()];
        ArrayList ans = new ArrayList();
        for(Object st : myList){
            String str=st.toString();
            tmp = "";
            for(int i = 0 ; i < str.length(); i++){
                if(str.charAt(i)==','){
                    if (!ans.contains(Integer.parseInt(tmp))){
                        ans.add(Integer.parseInt(tmp));
                        break;
                    }
                    tmp = "";
                    continue;
                }
                tmp+= str.charAt(i);
                if(i == str.length()-1){
                    ans.add(Integer.parseInt(tmp));
                }
            }
        }
        for(int i=0; i<answer.length;i++){
            answer[i] = (int)ans.get(i);
        }
        return answer;
    }
}

/*
import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
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
*/

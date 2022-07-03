package problems;

import java.util.*;

public class 압축 {

    public static void main(String[] args) {
//        String msg = "KAKAO";
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        System.out.println(Arrays.toString(solution(msg)));
    }

    public static int[] solution(String msg) {
        int[] answer = {};
        ArrayList ans = new ArrayList();
        ArrayList dict = new ArrayList();
        dict.add('-');
        for(char i='A';i<='Z';i++){
            dict.add(i);
        }
        int cursor = 0;
        String key = "";
        while (msg.length() > 0){ // msg 잘라냄으로 msg 없어질 떄 까지 수행
            if (cursor < msg.length()){ // 마지막에는 안함
                key += msg.charAt(cursor);
            }
            if (dict.contains(key) || (dict.contains(key.charAt(0))&& key.length()==1)){// char String 비교를 위해
                cursor++;
                if (cursor > msg.length()){ //마지막일때
                    if (key.length() == 1){
                        ans.add(dict.indexOf(key.charAt(0)));
                    }else{
                        ans.add(dict.indexOf(key));
                    }
                    break;
                }
            }else{
                dict.add(key); // 일치하는게 없으므로 사전에 추가
                key = key.substring(0, key.length()-1); // 제일 마지막 할 때면 사전에 존재하므로 그 단어 인덱스 출력
                if (key.length() == 1){
                    ans.add(dict.indexOf(key.charAt(0)));
                }else{
                    ans.add(dict.indexOf(key));
                }
                msg = msg.substring(key.length()); // msg잘라내기
                key = ""; // 키 초기화
                cursor = 0; // 커서초기화
            }
        }
        answer = new int[ans.size()]; // 답변환
        for(int i = 0; i<ans.size();i++){
            answer[i] = (int) ans.get(i);
        }
        return answer;
    }

}

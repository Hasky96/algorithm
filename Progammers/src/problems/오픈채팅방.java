package problems;

import java.util.*;

public class 오픈채팅방 {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }

    public static String[] solution(String[] record) {
        List<String> msgs = new ArrayList();
        Map<String, String> nicks= new HashMap<>();

        for(String rec:record){
            String[] arr = rec.split(" ");
            if(arr[0].equals("Enter") || arr[0].equals("Change")){
                if(nicks.containsKey(arr[1])){
                    nicks.replace(arr[1],arr[2]);
                }else{
                    nicks.put(arr[1], arr[2]);
                }
            }
            if(!arr[0].equals("Change")){
                msgs.add(arr[1]+" "+arr[0]);
            }
        }

        String[] answer = new String[msgs.size()];
        for(int i=0;i<msgs.size();i++){
            String tmp[] = msgs.get(i).split(" ");
            if(tmp[1].equals("Enter")){
                answer[i] = nicks.get(tmp[0])+"님이 들어왔습니다.";
            }else if(tmp[1].equals("Leave")){
                answer[i] = nicks.get(tmp[0])+"님이 나갔습니다.";
            }
        }

        return answer;
    }
}

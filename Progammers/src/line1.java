import java.util.*;

public class line1 {

    public static void main(String[] args) {
        String[] logs = {"morgan string_compare", "felix string_compare", "morgan reverse", "rohan sort", "andy reverse", "morgan sqrt"};
        System.out.println(Arrays.toString(solution(logs)));
    }

    public static String[] solution(String[] logs) {

        HashSet<String> userList= new HashSet<>();
        HashMap<String, HashSet<String>> qSolvers = new HashMap<>();
        for(String log : logs){
            String[] temp = log.split(" ");
            userList.add(temp[0]);
            HashSet innerSet =qSolvers.getOrDefault(temp[1], new HashSet<String>());
            innerSet.add(temp[0]);
            qSolvers.put(temp[1],innerSet);
        }
        ArrayList<String> answerList = new ArrayList<>();
        for(String key: qSolvers.keySet()){
            if(qSolvers.get(key).size()>=(int)Math.ceil(userList.size()/2.0)){
                answerList.add(key);
            }
        }
        String[] answer = new String[answerList.size()];
        for(int i=0;i< answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

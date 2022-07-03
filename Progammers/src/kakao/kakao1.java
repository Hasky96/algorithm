package kakao;

import java.util.*;

public class kakao1 {

    public static void main(String[] args) {
        String[] survey={"AN", "CF", "MJ", "RT", "NA"};
        int[] choieces = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choieces));
    }

    public static String solution(String[] survey, int[] choices) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("R",0);
        scores.put("T",0);
        scores.put("C",0);
        scores.put("F",0);
        scores.put("J",0);
        scores.put("M",0);
        scores.put("A",0);
        scores.put("N",0);

        for(int i=0; i<survey.length; i++){
            int score = choices[i]-4;
            if(score>0){
                scores.put(String.valueOf(survey[i].charAt(1)), scores.get(String.valueOf(survey[i].charAt(1)))+score);
            }else if(score<0){
                scores.put(String.valueOf(survey[i].charAt(0)), scores.get(String.valueOf(survey[i].charAt(0)))+Math.abs(score));
            }
        }
        String answer = "";
        if(scores.get("R")==scores.get("T")){
            answer+="R";
        }else{
            answer+= scores.get("R") > scores.get("T")?"R":"T";
        }

        if(scores.get("C")==scores.get("F")){
            answer+="C";
        }else{
            answer+= scores.get("C") > scores.get("F")?"C":"F";
        }

        if(scores.get("J")==scores.get("M")){
            answer+="J";
        }else{
            answer+= scores.get("J") > scores.get("M")?"J":"M";
        }

        if(scores.get("A")==scores.get("N")){
            answer+="A";
        }else{
            answer+= scores.get("A") > scores.get("N")?"A":"N";
        }


        return answer;
    }

}

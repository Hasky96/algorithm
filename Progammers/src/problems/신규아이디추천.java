package problems;

import java.util.*;


public class 신규아이디추천 {

    public static void main(String[] args) {
//        String new_id = "...!@BaT#*..y.abcdefghijklm";
//        String new_id = "z-+.^.";
//        String new_id = "=.=";
//        String new_id = "123_.def";
        String new_id = "abcdefghijklmn.p";
        System.out.println(solution(new_id));
    }

    public static String solution(String new_id) {
        String answer = "";
        // 1. 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2. [알파벳소문자, 숫자, -, .] 만 남김
        String pattern = "[^0-9a-z-_.]*";
        new_id = new_id.replaceAll(pattern, "");
        // 3. [.]가 2번 이상 연속 => [.]
        new_id = new_id.replaceAll("[.]{2,}",".");
        // 4. [.]이 처음이나 끝에 존재한다면 제거
        new_id = new_id.replaceAll("(^[.]|[.]$)","");
        // 5. 빈 문자열이면 "a"를 대입
        if(new_id.length()==0) new_id = "a";
        // 6. 길이가 16자 이상이면 첫 15자리만 허용
        if(new_id.length()>15){
            new_id=new_id.substring(0,15);
            new_id = new_id.replaceAll("(^[.]|[.]$)","");
        }
        // 7. 길이가 2자 미만 이라면 길이가 3이 될때까지 반복해서 끝에 붙인다.
        int adding = 3-new_id.length();
        if(adding>0){
            String a =String.valueOf(new_id.charAt(new_id.length()-1));
            for(int i=0;i<adding;i++)
                new_id += a ;
        }


        answer=new_id;
        return answer;
    }


}

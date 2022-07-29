package Programmers;

public class pro76501_findTF {

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(solution(absolutes,signs));
    }


    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if(signs[i]){
                answer+= absolutes[i];
            }else{
                answer-= absolutes[i];
            }
        }
        return answer;
    }

}

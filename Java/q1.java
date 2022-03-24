import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4,10)));
    }

    public static int[] solution(int money, int limit) {
        int[] answer = new int[2];
        boolean flag= false;
        boolean first = true;
        while(true){
            if(money - limit < 0 ){
                flag = false;
                answer[1]++;
                if (limit<=1){
                    break;
                }
                limit /= 2;
            }else{
                answer[0]++;
                if(flag || first){
                    break;
                }
                flag = true;
                money -= limit;
            }
            first = false;
        }
        return answer;
    }

}

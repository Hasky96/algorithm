import java.util.Arrays;

public class 양궁대회 {

    static int[] apeach;
    static int[] answer;
    static int score = 0;
    public static void main(String[] args) {

        int n = 5;
        int[] info = new int[]{2,1,1,1,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(solution(n, info)));
    }

    public static int[] solution(int n, int[] info) {
        apeach = info;

        dfs(n, new int[11], 0);

        return answer == null? new int[]{-1} : answer;
    }
 
    public static void dfs(int n, int[] arr,int j){
        // 종료 조건
        if(n < 1){
            int difScore = isWin(arr);
//            System.out.println(difScore);
            if(difScore > 0 && score <= difScore ) {
//                System.out.println(Arrays.toString(arr));
                if(score == difScore){
                    for(int i = 10; i>=0; i--){
                        if(answer[i]==arr[i])continue;
                        else if(answer[i]<arr[i]){
                            answer = Arrays.copyOf(arr, 11);
                            return;
                        }else if(answer[i]>arr[i]){
                            return;
                        }
                    }
                }else{
                    answer = Arrays.copyOf(arr, 11);
                    score = difScore;
                }
            }
            return;
        }
        // 반복
        for(int i =j; i<11; i++){
            arr[i]+=1;
            dfs(n-1, Arrays.copyOf(arr, 11), i);
            arr[i]-=1;
        }

    }

    public static int isWin(int[] arr){
        int A = 0;
        int R = 0;
        for(int i=0; i<10;i++){
            if(arr[i]==0 && apeach[i]==0) continue;
            if(arr[i]>apeach[i]){
                R+= 10-i;
            }else{
                A+= 10-i;
            }
        }
//        System.out.println(A);
//        System.out.println(R);
//        System.out.println("---");
        // 점수비교
        return R > A? R-A : -1;
    }
}

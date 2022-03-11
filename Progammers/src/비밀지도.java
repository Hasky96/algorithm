import java.util.Arrays;

public class 비밀지도 {

    public static void main(String[] args) {
//        int n = 5;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n,arr1, arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; // n개의 값을 가지는 배열
        for(int i =0; i<n;i++ ){ // 두개으 배열을 순환하면서 and 비교
            String row = ""; // 정답이 되는 줄
            int cnt = n; // n번만큼 while문 수행하기 위함
            while(cnt>0){
                if( arr1[i] % 2 == 1 || arr2[i] % 2 == 1){ // 이진수를 한자리씩 구해 and 연산
                    row = "#"+row;  // and 값이 True 인 경우만 체크
                }else{
                    row = " "+row;  // and 값이 false 인 경우만 체크
                }
                arr1[i]/=2; // 다음자리 확인을 위해 2로 나누어줌
                arr2[i]/=2;
                cnt--;
            }
            answer[i] = row;
        }
        return answer;
    }

}

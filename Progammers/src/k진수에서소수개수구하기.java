public class k진수에서소수개수구하기 {
    public static void main(String[] args) {

        int n = 437674;
        int k = 3;
        System.out.println(solution(n,k));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        String num = "";
        // k 진수 변환
        while(n>0){
            if(String.valueOf(n%k).equals("0")){
                if(isPrimaryNum(num)) answer++;
                num="";
            }
            else{
                num = n%k + num;
            }
            n /= k;
        }
        if(isPrimaryNum(num)) answer++;

        return answer;
    }

    public static boolean isPrimaryNum(String n){
//        System.out.println(n + "func");

        if(n.equals("") || n.equals("1") || n.equals("0")) return false;
        Long k =Long.parseLong(n);
        for(int i = 2 ; i<=Math.sqrt(k) ; i++){
            if (k%i == 0){
                return false;
            }
        }
        return true;
    }
}

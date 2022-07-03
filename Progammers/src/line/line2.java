package line;

import java.util.*;

public class line2 {

    public static void main(String[] args) {
        int n = 4;
        int[] times = {2,3};
    }

    public static int solution(int n, int[] times) {
        int answer = 0;
        String binary = Integer.toBinaryString(n);
        for(int i =0;i<binary.length()-1;i++){
            answer+= times[i];
        }
        int binaryInt = Integer.parseInt(binary.substring(1,binary.length()));
        for(int i = 0;binaryInt!=0;i++){
            if(binaryInt%10==1){
                answer+= times[i];
            }
            binaryInt/=10;
        }

        return answer;
    }
}

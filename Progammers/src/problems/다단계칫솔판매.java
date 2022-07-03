package problems;

import java.util.*;

public class 다단계칫솔판매 {

    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        System.out.println(Arrays.toString(solution(enroll, referral, seller, amount)));
    }


    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer= new int[enroll.length];
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;
        for(String name: enroll){
            map.put(name, idx++);
        }
        idx = 0;
        //unionfind
        int[] union = new int[enroll.length];
        for(String parent: referral){
            if(parent.equals("-")){
                union[idx++] = 11111;
            }else{
                union[idx++] = map.get(parent);
            }
        }
        for(int i = 0; i < seller.length;i++){
            int num =  map.get(seller[i]);
            int earn = 100*amount[i];
            while(earn >= 1){
                int money = earn/10;
                //int money = (int)Math.round(0.1*earn)
                answer[num] += earn - money;
                earn = money;
                num = union[num];
                if(num == 11111) break;
            }

        }
        return answer;
    }




}

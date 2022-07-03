package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class 주차요금계산개선 {

    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records ={"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(solution(fees, records)));

    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer;
        int time = fees[0];
        int fee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        Map<String, Integer> carTime = new HashMap<String, Integer>();
        Map<String, Integer> carFee = new HashMap<String, Integer>();
        Map<String, String> parkingLot = new HashMap<String, String>();
        int totalFee = 0;
        // 기록확인하며 입출차 확인
        for(String record : records){

            String temp[] = record.split(" ");
            String recTime = temp[0];
            String carNum = temp[1];
            String status = temp[2];

            // 입차
            if(status.equals("IN")){
                parkingLot.put(carNum, recTime);
            }
            // 출차
            else{
                totalFee = 0;
                String timeIn = parkingLot.get(carNum);
                parkingLot.remove(carNum);
                String[] t = timeIn.split(":");
                int h1 = Integer.parseInt(t[0]);
                int m1 = Integer.parseInt(t[1]);
                t = recTime.split(":");
                int h2 = Integer.parseInt(t[0]);
                int m2 = Integer.parseInt(t[1]);
                int h = h2-h1;
                int m = 0;
                if(m2-m1 >= 0){
                    m = m2-m1;
                }else{
                    m = 60+(m2-m1);
                    h-=1;
                }
                if(h>0) m += 60 * h;
                //시간만 합산해둠
                carTime.put(carNum, carTime.getOrDefault(carNum, 0)+ m);
            }
        }
        // 모든기록 확인 후 남은차량 시간 계산 후 더해주기
        for(String leftCarNum : parkingLot.keySet()){
            int h2 = 23;
            int m2 = 59;
            String[] t = parkingLot.get(leftCarNum).split(":");
            int h1 = Integer.parseInt(t[0]);
            int m1 = Integer.parseInt(t[1]);
            int h = h2-h1;
            int m = 0;
            if(m2-m1 >= 0){
                m = m2-m1;
            }else{
                m = 60+(m2-m1);
                h-=1;
            }
            if(h>0) m += 60 * h;
            carTime.put(leftCarNum, carTime.getOrDefault(leftCarNum, 0)+ m);
        }
        // 차량시간 확인해여 요금 계산
        for(String cN: carTime.keySet()){
            totalFee = 0;
            int m = carTime.get(cN);
            if( m > time){
                m -= time;
                totalFee += fee;
                if(m%unitTime==0){
                    totalFee += m/unitTime*unitFee;
                }else{
                    totalFee += (m/unitTime + 1)*unitFee;
                }
                carFee.put(cN, carFee.getOrDefault(cN,0)+totalFee);
            }else{
                carFee.put(cN, carFee.getOrDefault(cN,0)+fee);
            }
        }
        // 차량 사전순으로 정렬
        String[] numArr = carFee.keySet().toArray(String[]::new);
        Arrays.sort(numArr);
        answer = new int[numArr.length];
        for(int i=0;i< numArr.length;i++){
            answer[i] = carFee.get(numArr[i]);
        }
        return answer;
    }
    //TreeMap
    /*
    * Key를 아라서 오름차순 으로 정렬
    * TreeMap m = new TreeMap
    * 내림차순하려면
    * NavigableMap n = m.descendingMap();
    *
    *
    *
    */
}

package problems;

import java.util.*;

public class 메뉴리뉴얼 {
    public static Map<String, Integer> courseMap= new HashMap<>();

    public static void main(String[] args) {
//        String[] order = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//        int[] course = {2, 3, 4};
//        String[] order = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
//        int[] course = {2, 3, 5};
        String[] order = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};
        System.out.println(Arrays.toString(solution(order, course)));
    }

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList list = new ArrayList();
        int[] ordersLength = new int[11]; // 주문기일의 갯수 index가 길이 값이 갯수

        for (int i = 0; i < orders.length; i++) {
            ordersLength[orders[i].length()]++;
        }

        // 코스 길이별로 탐색!
        for (int len : course) {

            for (String order : orders) {
                // 주문이 코스길이 보다 짧으면 안함
                if (order.length() < len) continue;

                getCourse(0, len, order, "");
            }
            int maxValue = 0;
            if(!courseMap.isEmpty()) {
                maxValue = Collections.max(courseMap.values());
            }
            if(maxValue > 1){
                for(String tmp : courseMap.keySet()){
                    if(courseMap.get(tmp) == maxValue){
                        list.add(tmp.toString());
                    }
                }
            }
            courseMap.clear();
        }
        answer = new String[list.size()];
        for(int i = 0;i<list.size(); i++){
            answer[i] = (String) list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }


    public static int getCourse(int cnt, int len, String order, String course){

        if(course.length() == len){
            if( courseMap.keySet().contains(course)){
                courseMap.replace(course, courseMap.get(course) + 1);
            }else{
                courseMap.put(course, 1);
            }
            return 1;
        }
        if(course.length() > len) return 0;

        for(int i =cnt ; i < order.length(); i ++){
            getCourse(i + 1, len, order, course + order.charAt(i));
        }

        return 0;
    }
}

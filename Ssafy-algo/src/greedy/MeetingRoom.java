package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoom {

    static class Meeting implements Comparable<Meeting>{
        int start, end;

        public Meeting(int start, int end){
            super();
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) { // 양수 or 음수
            // 종료시간을 기준으로 오름차순
            // 음수 : 내가 작다 ==> 그대로
            // 0 : 같다 ==> 그대로
            // 양수 : 내가 크다 ==> 바뀜

            int value = this.end - o.end;
            if(value != 0) return value;
            // 종료시간이 같다면
            return this.start - o.start;
        }

        @Override
        public String toString() {
            return "Meeting [ "+start+" ~ "+end+" ]";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Meeting[] meetings = new Meeting[N];
        for(int i = 0 ; i < N ; i++){
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }

        for(Meeting meeting: getSchedule(meetings)){
            System.out.println(meeting);
        }
    }

    static ArrayList<Meeting> getSchedule(Meeting[] meetings){
        ArrayList<Meeting> list = new ArrayList<Meeting>();

        Arrays.sort(meetings);
        list.add(meetings[0]);

        for(int i = 1, size = meetings.length; i< size ; i++){
            if(list.get(list.size()-1).end <= meetings[i].start){
                list.add(meetings[i]);
            }
        }
        return list;
    }
}

/* 10
1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14 */

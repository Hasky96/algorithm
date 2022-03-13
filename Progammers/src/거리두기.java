import java.util.Arrays;

public class 거리두기 {


    public static void main(String[] args) {
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(solution(places)));
    }

    public static int[] solution(String[][] places) {
        int[] answer = {1, 1, 1, 1, 1};
        for(int i = 0; i < 5 ; i++) {
            String[] room = places[i];
            boolean stop = false;
            for(int j = 0; j < 5;j++){
                if (stop) break;
                for(int k=0;k<5;k++){
                    if(room[j].charAt(k) == 'P'){
                        // 1칸 확인
                        if(j-1>=0 && room[j-1].charAt(k) == 'P'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(j+1<5 && room[j+1].charAt(k) == 'P'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(k+1<5 && room[j].charAt(k+1) == 'P'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(k-1>=0 && room[j].charAt(k-1) == 'P'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }
                        // 2칸확인
                        if(j-2>=0 && room[j-2].charAt(k) == 'P' && room[j-1].charAt(k) != 'X'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(j+2<5 && room[j+2].charAt(k) == 'P'&& room[j+1].charAt(k) != 'X'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(k+2<5 && room[j].charAt(k+2) == 'P'&& room[j].charAt(k+1) != 'X'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }if(k-2>=0 && room[j].charAt(k-2) == 'P'&& room[j].charAt(k-1) != 'X'){
                            answer[i] = 0;
                            stop = true;
                            break;
                        }
                        //대각선 확인
                        if(j-1>=0 && k+1<5 && room[j-1].charAt(k+1) == 'P'){
                            if(room[j-1].charAt(k) == 'X' && room[j].charAt(k+1) == 'X'){}
                            else{
                                answer[i] = 0;
                                stop = true;
                                break;
                            }
                        }if(j+1<5 && k+1<5 && room[j+1].charAt(k+1) == 'P'){
                            if(room[j+1].charAt(k) == 'X' && room[j].charAt(k+1) == 'X'){}
                            else{
                                answer[i] = 0;
                                stop = true;
                                break;
                            }
                        }if(j-1>=0 && k-1>=0 && room[j-1].charAt(k-1) == 'P'){
                            if(room[j-1].charAt(k) == 'X' && room[j].charAt(k-1) == 'X'){}
                            else{
                                answer[i] = 0;
                                stop = true;
                                break;
                            }
                        }if(j+1<5 && k-1>=0 && room[j+1].charAt(k-1) == 'P'){
                            if(room[j+1].charAt(k) == 'X' && room[j].charAt(k-1) == 'X'){}
                            else{
                                answer[i] = 0;
                                stop = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}

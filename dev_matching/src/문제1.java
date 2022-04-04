import java.util.*;

public class 문제1 {
    public static void main(String[] args) {
        int[][] dist = {{0,5,2,4,1},{5,0,3,9,6},{2,3,0,6,3},{4,9,6,0,3},{1,6,3,3,0}};
        System.out.println(Arrays.deepToString(solution(dist)));
    }

    public static int[][] solution(int[][] dist) {
        int[][] answer;
        ArrayList<int[]> ans = new ArrayList();
        //set start point
        loop1 :for(int i = 0; i < dist.length; i++){
            TreeMap<Integer, Integer> map = new TreeMap();
            for(int j=0; j < dist[i].length ; j++) {
                map.put(dist[i][j], j);
            }
            int[] arr = new int[map.size()];
            int idx=0;
//            System.out.println(map);
            for(int z: map.values()){
                arr[idx++] = z;
            }
            if(arr.length != dist[i].length){
                continue loop1;
            }
//            System.out.println(Arrays.toString(arr));
            // Check
            for(int k=2; k < dist[i].length; k++){
                if( dist[i][(int)arr[k]] != dist[i][(int)arr[k-1]] + dist[(int)arr[k]][(int)arr[k-1]] ){
                    continue loop1;
                }
            }
            ans.add(arr);
        }
        answer = new int[ans.size()][dist[0].length];
        for(int i = 0; i< ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }


}

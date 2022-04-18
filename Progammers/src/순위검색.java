import java.util.*;

public class 순위검색 {

    static ArrayList<Integer> arr;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"},
                new String[]{"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"})
        ));
    }
    static class developer{
        String lang;
        String dep;
        String career;
        String soulfood;
        int score;

        public developer(String str){
            String[] info = str.split(" ");
            this.lang = info[0];
            this.dep = info[1];
            this.career = info[2];
            this.soulfood = info[3];
            this.score = Integer.parseInt(info[4]);
        }

        public void check(String str){
            String[] temp = str.split(" and ");
            if( (temp[0].equals("-") || temp[0].equals(this.lang))&&
                (temp[1].equals("-") || temp[1].equals(this.dep))&&
                (temp[2].equals("-") || temp[2].equals(this.career))&&
                (temp[3].split(" ")[0].equals("-") || temp[3].split(" ")[0].equals(this.soulfood))
            ) arr.add(this.score);
        }

    }
    public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        List<developer> list= new ArrayList<developer>();
        for(String i:info){
            list.add(new developer(i));
        }
        for(int i=0;i<query.length;i++){
            System.out.println(i);
            if(list.size()==0){
                answer[i] = 0;
            }
            arr = new ArrayList();
            for(developer d:list){
                d.check(query[i]);
            }
            int cut = Integer.parseInt(query[i].split(" and ")[3].split(" ")[1]);
            Collections.sort(arr);
            loop : for(int st=0, end = arr.size()-1;st <= end;) {
                int mid = (st + end) / 2;
                System.out.println(arr.toString());
                System.out.println(st+" "+mid+" "+end+" "+cut);
                if (mid == 0) {
                    if(arr.get(mid)>=cut){
                        answer[i] = arr.size()-1;
                        break loop;
                    }
                    answer[i] = 0;
                    break loop;
                }else if (arr.get(mid - 1) < cut && cut <= arr.get(mid)) {
                    answer[i] = arr.size() - mid;
                    break loop;
                } else if (arr.get(mid) < cut) {
                    st = mid;
                } else if (arr.get(mid) > cut) {
                    end = mid;
                }
            }
        }
        return answer;
    }
}

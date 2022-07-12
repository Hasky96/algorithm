import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1316_groupWordChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=0;
        while(N-->0){
            count++;
            String word = br.readLine();
            ArrayList<Character> al = new ArrayList<Character>();
            char check = ' ';
            for(char c : word.toCharArray()){
                if(check == c) continue;
                check = c;
                if(al.contains(c)){
                    count--;
                    break;
                }
                al.add(c);
            }
        }
        System.out.println(count);
    }

}

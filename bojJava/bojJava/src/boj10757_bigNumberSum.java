import java.util.Scanner;
import java.util.StringTokenizer;

public class boj10757_bigNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        char[] num1 = st.nextToken().toCharArray();
        char[] num2 = st.nextToken().toCharArray();

        int len1 = num1.length;
        int len2 = num2.length;

        int cnt = 0;
        int temp = 0;
        int n1;
        int n2;
        StringBuilder sb = new StringBuilder();
        while(cnt<len1 || cnt<len2){
            cnt++;
            if(len1 >= cnt){
                n1 = (int)num1[len1-cnt] - 48;
            }else{
                n1 = 0;
            }
            if(len2 >= cnt){
                n2 = (int)num2[len2-cnt] - 48;
            }else{
                n2 = 0;
            }
            int total = n1+n2+temp;
            temp = total/10;
            sb.append(total%10);
        }
        if(temp!=0)sb.append(temp);
        System.out.println(sb.reverse().toString());
    }


}

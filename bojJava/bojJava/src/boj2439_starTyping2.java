import java.util.Scanner;

public class boj2439_starTyping2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb =new StringBuilder();
        int cnt= 1;
        while(N>0){
            for(int i=1; i<N;i++){
                sb.append(" ");
            }
            for(int i=0; i<cnt;i++){
                sb.append("*");
            }
            sb.append("\n");
            N--;
            cnt++;
        }
        System.out.println(sb.toString());
    }
}

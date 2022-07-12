import java.util.Scanner;
import java.util.StringTokenizer;

public class boj2480_threeDice {

    public static void main(String[] args) {
        int[] dices = new int[7];
        Scanner sc = new Scanner(System.in);
        StringTokenizer st= new StringTokenizer(sc.nextLine());
        while(st.hasMoreTokens()){
            dices[Integer.parseInt(st.nextToken())]++;
        }
        int money = 0;
        for(int i = 1; i <= 6; i++){
            if(dices[i]==3){
                money = 10000 + 1000*i;
                break;
            } else if (dices[i]==2) {
                money = 1000 +  i*100;
                break;
            } else if (dices[i]==1) {
                money = i * 100;
            }
        }
        System.out.println(money);
    }

}

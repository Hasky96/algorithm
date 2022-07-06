package Example;

import java.util.Arrays;

public class Dice01 {

    static int[] diceResult;
    static int diceThrows;

    public static void main(String[] args) {
        diceThrows = 3;
        diceResult = new int[3];

        diceThrow(0);
    }

    public static void diceThrow(int cnt){
        if(cnt == diceThrows){
            System.out.println(Arrays.toString(diceResult));
            return;
        }
        for(int i = 1; i<=6;i++){
            diceResult[cnt] = i;
            diceThrow(cnt + 1);
        }
    }


}

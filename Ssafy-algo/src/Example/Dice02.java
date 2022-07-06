package Example;

import java.util.Arrays;

public class Dice02 {
    static int[] diceResult;
    static boolean[] isSelected;
    static int diceThrows;

    public static void main(String[] args) {
        diceThrows = 3;
        isSelected = new boolean[7];
        diceResult = new int[3];

        diceThrow(0);
    }

    public static void diceThrow(int cnt){

        if(cnt==diceThrows){
            System.out.println(Arrays.toString(diceResult));
            return;
        }

        for(int i = 1 ; i <= 6 ; i++){
            if(isSelected[i]) continue;
            diceResult[cnt] = i;
            isSelected[i] = true;
            diceThrow(cnt+1);
            isSelected[i] = false;

        }
    }
}

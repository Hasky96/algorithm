import java.util.Scanner;

public class boj1157_wordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int[] alpha = new int[26];
        for(char c:word.toCharArray()){
            alpha[c-65]++;
        }
        int maxIdx = -1;
        boolean flag = false;
        for(int i=0;i<26;i++){
            if(maxIdx==-1||alpha[i]>alpha[maxIdx]){
                flag = true;
                maxIdx = i;
            } else if (alpha[i]==alpha[maxIdx]) {
                flag= false;
            }
        }
        if(flag) System.out.println(Character.toChars(maxIdx+65));
        else System.out.println("?");
    }
}

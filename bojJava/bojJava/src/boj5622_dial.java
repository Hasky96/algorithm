import java.util.Scanner;

public class boj5622_dial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mapper = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        char[] word = sc.nextLine().toUpperCase().toCharArray();
        int answer = 0;
        for(char c : word){
            answer += mapper[c-65]+1;
        }
        System.out.println(answer);


    }
}

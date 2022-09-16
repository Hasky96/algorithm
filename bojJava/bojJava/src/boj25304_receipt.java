import java.util.Scanner;

public class boj25304_receipt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int T = sc.nextInt();

        int total = 0;
        while(T-->0){
            total += sc.nextInt() * sc.nextInt();
        }
        if (total==X) System.out.println("Yes");
        else System.out.println("No");
    }

}

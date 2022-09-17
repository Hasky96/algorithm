import java.util.Scanner;

public class boj25501_RecursionMaster {

     static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        while(T-->0){
            cnt = 0;
            String str = sc.nextLine().trim();
            System.out.println(isPalindrome(str)+" "+ cnt);
        }

    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    public static int recursion(String s, int l, int r){
        cnt+=1;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}

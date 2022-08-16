import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boj11478_SubSetString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Set<String> set = new HashSet<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i+j>s.length()) break;
                set.add(s.substring(j,i+j));
            }
        }

        System.out.println(set.size());
    }
}

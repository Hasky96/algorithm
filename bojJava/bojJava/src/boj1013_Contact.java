import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class boj1013_Contact {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(input.readLine());
        String pattern = "(100+1+|01)+";

        for (int i = 0; i < T; i++) {
            String str = input.readLine();
            boolean result = Pattern.matches(pattern, str);
            System.out.println(result?"YES":"NO");
        }


    }
}

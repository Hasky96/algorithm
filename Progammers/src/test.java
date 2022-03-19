import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String a = "a";
        int n = 5;
        System.out.println(String.format("%"+n+"s", a ));
        String s = "dfqowi923eofi39";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String m = matcher.group();
            System.out.println(m);
        }

    }
}
/*
*     o
*    xox
*   ooPoo
*    xox
*     o
*
*
*
*
* */
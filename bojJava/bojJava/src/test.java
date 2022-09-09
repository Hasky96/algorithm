import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
//        System.out.println("Hello Java!");
//        System.out.println((int) '1');
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa\naa") ;
//        sb.replace(4,5,"b");
//        System.out.println(sb.toString());
//        System.out.println();
//        TreeMap<String, Integer> t = new TreeMap();
//        t.put("ab", 12);
//        t.put("ac", 13);
//        t.put("a", 1);
//        t.put("ad", 14);
//        System.out.println(t.toString());
//        t.pollFirstEntry();
//        t.pollLastEntry();
//
//        System.out.println(t.toString());
        String a = "문현역";
        Pattern pattern = Pattern.compile(".*\\s?[ㄱ-ㅎ|ㅏ-ㅣ|가-힣|0-9]+역\\s?.*");
        Matcher matcher = pattern.matcher(a);

        if(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

import java.util.TreeMap;

public class test {

    public static void main(String[] args) {
//        System.out.println("Hello Java!");
//        System.out.println((int) '1');
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa\naa") ;
//        sb.replace(4,5,"b");
//        System.out.println(sb.toString());
        System.out.println();
        TreeMap<String, Integer> t = new TreeMap();
        t.put("ab", 12);
        t.put("ac", 13);
        t.put("a", 1);
        t.put("ad", 14);
        System.out.println(t.toString());
        t.pollFirstEntry();
        t.pollLastEntry();

        System.out.println(t.toString());
    }
}

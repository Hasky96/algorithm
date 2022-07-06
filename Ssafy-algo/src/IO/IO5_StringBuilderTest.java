package IO;

public class IO5_StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("SSAFY!!");

        sb.setLength(sb.length()-2);
        //sb 여러 함수 많음 reverse....etc


        System.out.println(sb.toString());
    }
}

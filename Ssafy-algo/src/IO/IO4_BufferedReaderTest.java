package IO;

import java.io.*;
import java.util.Scanner;

// 기수 : 6
// 우리를 한마디로 표현하면? 핫씩스
public class IO4_BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("기수? : ");
        int no = Integer.parseInt(in.readLine());
        System.out.println("우리를 한마디로 표현하면? ");
        String msg = in.readLine();
        System.out.println(no+"::"+msg);
    }
}

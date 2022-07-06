package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 기수 : 6
// 우리를 한마디로 표현하면? 핫씩스
public class IO2_ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        // setIn 표준입력 제거 => 제출할떄 변경 해야함
        Scanner sc = new Scanner(System.in);
        System.out.println("기수? : ");
        int no = sc.nextInt();
        System.out.println("우리를 한마디로 표현하면? ");
//        String msg = sc.next();
        sc.nextLine();// 남아있던 계행을 날림 -> 없으면 끝나버림
        String msg = sc.nextLine();
        System.out.println(no+"::"+msg);
    }
}

package IO;

import java.util.Scanner;


// 1 3.5 SSAFY
public class IO1_ScannerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // white space(space, tab, enter) 전까지 읽음
        System.out.println("정수, 실수, 문자열 순서로 입력");

        System.out.print("읽은 정수 : " + sc.nextInt());
        System.out.print("읽은 실수 : " + sc.nextDouble());
//        System.out.print("읽은 문자열 : " + sc.next()+ "!!");
        System.out.print("읽은 문자열 : " + sc.nextLine()+ "!!");
//      계행라인 까지 읽음 엔터전까지 읽음


    }
}

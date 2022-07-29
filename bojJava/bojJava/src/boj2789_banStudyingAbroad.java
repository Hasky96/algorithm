import java.util.Scanner;

public class boj2789_banStudyingAbroad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

//        word = word.replaceAll("[C|A|M|B|R|I|D|G|E]", "");
        word = word.replaceAll("[CAMBRIDGE]", "");
        System.out.println(word);
    }
}

/*
.x: 임의의문자 + x
ex) a.c : abc, a0c ,,
ex) a..c : abbc, a00c ,,

x* : x의 0번 이상 반복

x+ : x의 1번 이상 반복

^x : 문자열이 x로 시작

x$ : 문자열이 x로 끝남

x? : x가 존재할수도, 하지 않을 수도 있음
ex) ab?c : ac, abc 모두 가능
x|y : x 또는 y
ex) (x|y)z : xy 또는 yz 모두 가능

x{n} : x의 n번 반복

x{m,n} : x의 m번 이상 n번 이하 반복

x{n,} : x의 n번 이상 반복

[xy] : x 또는 y 한 문자

[x-z] : x~z 범위 내의 한 문자

[^xy] : x 또는 y를 제외한 한 문자
ex) [^yz] : a, b, c, ,,, w, x 중 한 문자를 의미
 */
import java.util.Scanner;

public class boj17429_teboteboPunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String afterImage = sc.nextLine()+"="; // 오른 손이 없는 경우 arrayIndex Error
        String[] lr = afterImage.split("\\(\\^0\\^\\)"); // 뒤에 없으면 [1] 안생김
        lr[0] = lr[0].replaceAll("[^@]", "");
        lr[1] = lr[1].replaceAll("[^@]", "");

        System.out.println(lr[0].length() + " " +lr[1].length());
    }
}

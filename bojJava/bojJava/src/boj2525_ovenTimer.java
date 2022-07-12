import java.util.Scanner;

public class boj2525_ovenTimer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] now = sc.nextLine().split(" ");
        int time = sc.nextInt();
        int endTime = Integer.parseInt(now[0])*60 + Integer.parseInt(now[1]) + time;
        System.out.println(endTime/60%24 + " " + endTime%60);

    }

}

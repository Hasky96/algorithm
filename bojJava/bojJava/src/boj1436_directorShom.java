import java.util.Scanner;

public class boj1436_directorShom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int no = 1;
        int number = 666;
        while (no!=N){
            if (String.valueOf(++number).contains("666")) no++;
        }
        System.out.println(number);
    }

}

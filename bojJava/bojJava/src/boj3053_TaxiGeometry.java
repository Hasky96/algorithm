import java.text.Format;
import java.util.Scanner;

import static java.lang.Math.*;

public class boj3053_TaxiGeometry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        Double temp = pow(R,2);
        System.out.printf("%.6f" , temp*PI);
        System.out.printf("\n%.6f" , 2*temp);
    }
}

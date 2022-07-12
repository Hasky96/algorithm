import java.util.Scanner;

public class boj2941_croatiaAlpha {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        int count = 0;
//        for(int i =1;i<word.length();i+=2){
//            count++;
//            if(word.charAt(i)=='z')i++;
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.replaceAll("dz=","*");
        word = word.replaceAll("c-","*");
        word = word.replaceAll("c=","*");
        word = word.replaceAll("d-","*");
        word = word.replaceAll("lj","*");
        word = word.replaceAll("nj","*");
        word = word.replaceAll("s=","*");
        word = word.replaceAll("z=","*");
    }
}

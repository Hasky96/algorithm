import java.util.Scanner;

public class boj2447_starTyping10 {

    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr= new char[N][N];
        star(0,0, N, false);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<N;i++){
            for(int j = 0;j<N;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());

    }

    public static void star(int x, int y, int size, boolean blank){

        if(blank){
            for(int i = x; i<x+size;i++){
                for(int j = y; j<y+size;j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(size==1){
            arr[x][y]='*';
            return;
        }

        int count = 0;
        for(int i = x; i<x+size;i+=size/3){
            for(int j = y; j<y+size;j+=size/3){
                count++;
                if(count==5){
                    star(i,j,size/3,true);
                }else{
                    star(i,j,size/3,false);
                }
            }
        }

    }
}

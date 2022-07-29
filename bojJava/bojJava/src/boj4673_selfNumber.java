public class boj4673_selfNumber {

    public static void main(String[] args) {

        boolean[] sn = new boolean[10001];


        for (int i = 1; i <= 10000 ; i++) {
            String number = String.valueOf(i);
            int sum=i;
            for (char a:number.toCharArray()){
                sum += (int)a-48;

            }
            if(sum<=10000) sn[sum] = true;
        }

        for (int i = 1; i <=10000 ; i++) {
            if(sn[i])continue;
            System.out.println(i);
        }
    }
}

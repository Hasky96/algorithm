
public class SubsetTest {

    public static void main(String[] args) {
        int N = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < (int)Math.pow(2,N); i++){
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for(int j = 0 ; j < N;j++){
                if((i & 1<<j) != 0) sb.append(arr[j]).append(", ");
            }
            if(sb.length()>4) sb.setLength(sb.length()-2);
            sb.append(" ]");
            System.out.println(sb.toString());
        }

    }
}

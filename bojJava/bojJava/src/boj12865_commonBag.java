import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/** 평범한 배낭 */
public class boj12865_commonBag {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int prdtCnt = Integer.parseInt(st.nextToken());
        int wegtLmt = Integer.parseInt(st.nextToken());

        int[] wegtArr = new int[101];
        int[] valArr = new int[101];

        for (int i = 1; i <= prdtCnt; i++) {
            st = new StringTokenizer(br.readLine());
            wegtArr[i] = Integer.parseInt(st.nextToken());
            valArr[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[100001];

        for (int i = 1; i <= prdtCnt; i++) {
            for (int j = wegtLmt; j >= 1; j--) {
                if (wegtArr[i] <= j) { // 무게체크
                    dp[j] = Math.max(dp[j], dp[j - wegtArr[i]] + valArr[i]);
                    // 넣음? 안넣음?
                }
            }
        }


        System.out.println(dp[wegtLmt]);

    }
    /***/
    public void testFunc() throws IOException {
    }

   /**
    *  404 SSR FNT => BND ? 확인? response처리를 하면 ? 유저(사용자)가 알아볼수 있을까? 내부에 확인이 쉬워
    *  500 => 들어가서 로그파일 다운 죽죽죽 스크롤올려가지고 확인...
    *  EC2
    *  response => ErrCode ErrMsg
    * 상품
    * 1. 품절되었다.
    * 2. 결제실패 유효한 카드가 아니다/ 돈이없다/ 은행 점검중이다/ 결제불가한 사람 .... etc
    * 3. 1인 1개만 구매가능하다
    * E9000 4자리? => 존나많다.
    * 5 8 2 9 1000개 4000개 errMsg
    * Enum이나 이런걸로 잘 정리해둔 사람
    * */



/**
 * dp[몇번째 물건까지 고려했는지][최대가치]
 *  무게  6  4  3 3 5
 *  가치 13  8  6 7 12
 *
 *  가방 7
 *     무게  1  2  3  4  5  6  7
 *  최대가치  0  0  7  8  8  13 15
 *
 * dp[가방무게]
 * */
}

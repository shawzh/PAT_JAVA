import java.util.Arrays;
import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/016
 *
 * @shawz
 */
public class MagicCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] conList = new long[n];
        for (int i = 0; i < n; i++) {
            conList[i] = sc.nextLong();
        }
        int m = sc.nextInt();
        long[] proList = new long[m];
        for (int i = 0; i < m; i++) {
            proList[i] = sc.nextLong();
        }

        Arrays.sort(conList);
        Arrays.sort(proList);
        int froma = 0, fromb = 0;
        long answer =0;
        for (; (froma < n) && (fromb < m) && (conList[froma] < 0) && (proList[fromb] < 0);
             answer += conList[froma++]*proList[fromb++])

            ;
        for (int i = n - 1, j = m - 1; (i >= froma) && (j >= fromb) && (conList[i] > 0) && (proList[j] > 0);
             answer += conList[i--]*proList[j--])

            ;

        System.out.println(answer);
    }
}

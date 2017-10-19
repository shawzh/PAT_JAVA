import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/7
 *
 * @shawz
 */
public class TheDominantColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int color = -1, count = 0;

        //摩尔投票法
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int tmpColor;
                tmpColor = sc.nextInt();
                if (color != tmpColor) {
                    if (count == 0)
                        color = tmpColor;
                    else
                        count--;
                } else
                    count++;
            }
        }
        System.out.println(color);
    }
}

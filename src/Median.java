import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/10
 *
 * @shawz
 */
public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N1; i++) {
            list.add(sc.nextInt());
        }
        int N2 = sc.nextInt();
        for (int i = 0; i < N2; i++) {
            list.add(sc.nextInt());
        }
        Object[] ns =  list.toArray();
        Arrays.sort(ns);


        System.out.println(ns[(N1 + N2-1) / 2]);

    }




}

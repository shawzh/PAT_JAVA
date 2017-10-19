import java.util.Scanner;

/**
 * running pass
 *
 * test pass
 *
 * create at 2017/09/27
 *
 * @shawz
 */
public class RationalSum {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();

        int[] nums = new int[loop];

        int[] dens = new int[loop];

        for (int i = 0; i < loop; i++) {
            String[] temp = sc.next().split("/");
            nums[i] = Integer.parseInt(temp[0]);
            dens[i] = Integer.parseInt(temp[1]);
        }

        //找小公倍数
        int max;
        max = dens[0];
        for (int i = 0; i < dens.length - 1; i++) {
            if (dens[i] < dens[i + 1]) {
                max = dens[i + 1];
            }
        }
        int key;
        while (true) {
            key = 0;
            for (int i : dens) {
                if (max % i == 0) {
                    key++;
                }
            }
            if (key == dens.length) {
                break;
            }
            max++;
        }

        int NUM = 0;
        for (int i = 0; i < nums.length; i++) {
            NUM += nums[i] * max / dens[i];
        }
        if (NUM % max == 0) {
            System.out.println(NUM / max);
        } else {
            int mult = getMaxMult(NUM, max);
            if (NUM > max) {
                int a = NUM/max;
                String b = (NUM-a*max)/mult +"/"+ max/mult;
                System.out.print(a);
                System.out.println(" "+b);

            } else {
                System.out.println(NUM/mult + "/" + max/mult);
            }
        }


    }

    private static int getMaxMult(int a, int b) {
        int r;
        a = Math.abs(a);
        b = Math.abs(b);
        // ensure that a > b
        if(a < b)
        {
            int temp = b;
            b = a;
            a = temp;
        }
        while(b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return a;


    }


}

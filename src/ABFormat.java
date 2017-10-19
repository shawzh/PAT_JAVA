import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/17
 *
 * @shawz
 */
public class ABFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = num1 + num2;
        String ne = "";
        if(res<0) {
            ne = "-";
            res = Math.abs(res);
        }
        ArrayList<String> resList = new ArrayList<>();
        while (res>0){
            resList.add((res%1000)+",");

            res = res/1000;
        }
        Collections.reverse(resList);//数组倒置
        String ans = ne;

        for (String s:
             resList) {
           ans+=s;
        }
        ans = ans.substring(0,ans.length()-1);
        System.out.println(ans);
    }
}

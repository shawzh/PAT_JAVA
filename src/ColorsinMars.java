import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/07
 *
 * @shawz
 */
public class ColorsinMars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        String Rout ,Gout,Bout;
        if (R<10){
           Rout = "0"+R;
        }else {
            Rout = Integer.toString(R,13).toUpperCase();//toString可以制定进制输出
        }
        if(G<10){
            Gout = "0"+G;
        }else{
            Gout = Integer.toString(G,13).toUpperCase();
        }
        if (B<10){
            Bout = "0"+B;
        }else {
            Bout = Integer.toString(B,13).toUpperCase();
        }


        System.out.print("#"+Rout+Gout+Bout);



    }
}

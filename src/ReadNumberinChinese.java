import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ReadNumberinChinese {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        if (inputNum == 0) {
            System.out.print("ling");
            System.exit(0);
        }
        HashMap<Integer, String> numMap = new HashMap<>();


        numMap.put(0, "ling");
        numMap.put(1, "yi");
        numMap.put(2, "er");
        numMap.put(3, "san");
        numMap.put(4, "si");
        numMap.put(5, "wu");
        numMap.put(6, "liu");
        numMap.put(7, "qi");
        numMap.put(8, "ba");
        numMap.put(9, "jiu");

        HashMap<Integer, String> unitMap = new HashMap<>();

        unitMap.put(0, "");
        unitMap.put(1, "Shi");
        unitMap.put(2, "Bai");
        unitMap.put(3, "Qian");
        unitMap.put(4, "Wan");
        unitMap.put(5, "Shi");
        unitMap.put(6, "Bai");
        unitMap.put(7, "Qian");
        unitMap.put(8, "Yi");
        unitMap.put(9, "Shi");

        ArrayList<Integer> nums = new ArrayList<>();

        if (inputNum < 0) {
            System.out.print("Fu ");
            inputNum = Math.abs(inputNum);
        }
        while (inputNum > 0) {
            nums.add(inputNum % 10);
            inputNum = inputNum / 10;
        }
        ArrayList<String> out = new ArrayList<>();


        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) == 0) {
                continue;

            }
            out.add(unitMap.get(i));
            out.add(numMap.get(nums.get(i)));

        }

        Collections.reverse(out);
        for (int i = 0; i < out.size(); i++) {


            if (out.size() == i+1){
                System.out.print(out.get(i));
                continue;
            }
            System.out.print(out.get(i)+" ");
        }


    }
}
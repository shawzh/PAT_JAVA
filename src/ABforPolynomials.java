import java.text.DecimalFormat;
import java.util.*;

/**
 * running pass
 * <p>
 * test pass
 * <p>
 * create at 2017/10/17
 *
 * @shawz
 */
public class ABforPolynomials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] polyString1 = line1.split(" ");
        String[] polyString2 = line2.split(" ");
        HashMap<Integer, Float> AB = new HashMap<>();

        for (int i = 1; i < polyString1.length - 1; i += 2) {
            AB.put(Integer.valueOf(polyString1[i]), Float.valueOf(polyString1[i + 1]));
        }
        for (int i = 1; i < polyString2.length - 1; i += 2) {
            if (!AB.containsKey(Integer.valueOf(polyString2[i]))) {
                AB.put(Integer.valueOf(polyString2[i]), Float.valueOf(polyString2[i + 1]));
            } else {
                AB.put(Integer.valueOf(polyString2[i]), Float.valueOf(polyString2[i + 1]) + AB.get(Integer.valueOf(polyString2[i])));
            }
        }
        int a = 0;
        String reg = "\\d+(\\.\\d+)?";//检测是不是小数
        ArrayList<Map.Entry> keyList = new ArrayList<>();
        keyList.addAll(AB.entrySet());
        Collections.sort(keyList, new myCom());
        for (Map.Entry e : keyList) {
            String temp = e.getValue().toString();
            if (temp.matches(reg)) {
                a++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.print(a);
        for (Map.Entry e : keyList) {
            if ((Float) e.getValue() != 0) {
                System.out.print(" " + e.getKey() + " " + df.format(e.getValue()));
            }
        }
    }

    static class myCom implements Comparator<Map.Entry> {
        @Override
        public int compare(Map.Entry o1, Map.Entry o2) {
            return (int) o2.getKey() - (int) o1.getKey();
        }
    }


}

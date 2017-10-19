import java.util.ArrayList;
import java.util.Scanner;
/**
 * running pass
 *
 * test pass
 *
 * create at 2017/10/16
 *
 * @shawz
 */
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<pass> teamList = new ArrayList<>();
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            pass p = new pass(sc.next(), sc.next());
            if (p.c) {
                teamList.add(p);
            }
        }
        if (teamList.size() == 0) {
            if (loop == 1) {
                System.out.println("There is " + loop + " account and no account is modified");
            } else {
                System.out.println("There are " + loop + " accounts and no account is modified");
            }
            System.exit(0);
        } else {
            System.out.println(teamList.size());
        }
        for (pass p :
                teamList) {
            System.out.println(p);
        }


    }

    static class pass {
        String team;
        String pass;
        Boolean c = false;

        pass(String team, String pass) {
            this.team = team;
            this.pass = changePass(pass);
        }

        @Override
        public String toString() {
            return team + " " + pass;
        }

        String changePass(String pass) {
            char[] chars = pass.toCharArray();
            String res = "";
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]) {
                    case '1':
                        res = res + '@';
                        this.c = true;
                        break;
                    case '0':
                        res = res + '%';
                        this.c = true;
                        break;
                    case 'l':
                        res = res + 'L';
                        this.c = true;
                        break;
                    case 'O':
                        res = res + 'o';
                        this.c = true;
                        break;
                    default:
                        res = res + chars[i];
                        break;
                }
            }
            return res;
        }
    }
}

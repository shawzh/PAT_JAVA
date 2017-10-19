import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * running pass
 *
 * test pass
 *
 * create at 2017/09/28
 *
 * @shawz
 */
public class ListGrades {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        ArrayList<Student> stus = new ArrayList<>();
        ArrayList<Student> res = new ArrayList<>();
        for (int i = 0; i < loop; i++) {
            Student student = new Student(sc.next(), sc.next(), sc.nextInt());
            stus.add(student);
        }

        int min = sc.nextInt();
        int max = sc.nextInt();
        for (Student stu : stus) {
            if (stu.getNum() >= min && stu.getNum() <= max) {
                res.add(stu);
            }
        }

        Collections.sort(res,new MyCom());

        if (res.isEmpty())
            System.out.println("NONE");
        for (Student s : res) {
            System.out.println(s);
        }


    }


    public static class Student {
        String name;
        String id;
        int num;

        Student(String name, String id, int num) {
            this.name = name;
            this.id = id;
            this.num = num;
        }

        int getNum() {
            return num;
        }

        @Override
        public String toString() {
            return name + " " + id;
        }
    }

    static class MyCom implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getNum()-o1.getNum();
        }
    }

}


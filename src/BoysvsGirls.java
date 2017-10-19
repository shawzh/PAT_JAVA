import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class BoysvsGirls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < loop; i++) {
            Student student = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
            students.add(student);
        }
        Collections.sort(students, new SortByNum());

        Student line1 = new Student();
        Student line2 = new Student();

        for (Student s : students) {
            if (s.sex.equals("F")) {

                line1 = s;
                break;
            }

        }
        for (int i = 0; i < students.size(); i++) {

            if (students.get(students.size() - i - 1).sex.equals("M")) {
                line2 = students.get(students.size() - i - 1);
                break;
            }
        }
        System.out.println(line1);
        System.out.println(line2);
        if (line1.name.equals("Absent") || line2.name.equals("Absent")) {
            System.out.println("NA");
            System.exit(0);
        }
        System.out.println(line1.score - line2.score);
    }


    static class Student {
        String name = "Absent";
        String sex;
        String code;
        int score;

        Student() {
        }

        public Student(String name, String sex, String code, int score) {
            this.name = name;
            this.sex = sex;
            this.code = code;
            this.score = score;
        }

        @Override
        public String toString() {
            if (name.equals("Absent"))
                return "Absent";
            return name + " " + code;
        }
    }

    static class SortByNum implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.score - o1.score;
        }
    }
}

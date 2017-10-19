import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class ListSorting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            Student s = new Student(sc.next(),sc.next(),sc.nextInt());
            studentArrayList.add(s);
        }
       switch (C){
           case 1:
               Collections.sort(studentArrayList,new SortById());
               break;
           case 2:
               Collections.sort(studentArrayList,new SortByName());
               break;
           case 3:
               Collections.sort(studentArrayList,new SortByNum());
               break;
       }
        for (Student s : studentArrayList) {
            System.out.println(s);
        }

    }

    public static class Student {
        String name;
        String id;
        int num;

        Student(String id, String name, int num) {

            this.id = id;
            this.name = name;
            this.num = num;
        }

        int getNum() {
            return num;
        }

        @Override
        public String toString() {
            return id+" "+name+" "+num;
        }
    }

    static class SortByNum implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
           if(o1.num>o2.num)
               return 1;
           else if(o1.num<o2.num)
               return -1;
           return  Integer.parseInt(o1.id)-Integer.parseInt(o2.id);
        }
    }
    static class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            char[] chars1 = o1.name.toCharArray();
            char[] chars2 = o2.name.toCharArray();
            int lenMin = Math.min(chars1.length, chars2.length);
            for(int i = 0 ; i < lenMin ; i++){

                if (chars1[i]>chars2[i])
                    return 1;
                else if (chars1[i]<chars2[i])
                    return -1;

            }
            if (chars1.length>chars2.length)
                return 1;
            else if(chars1.length<chars2.length)
                return -1;
            return Integer.parseInt(o1.id)-Integer.parseInt(o2.id);
        }
    }


    static class SortById implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.parseInt(o1.id)-Integer.parseInt(o2.id);
        }
    }
}

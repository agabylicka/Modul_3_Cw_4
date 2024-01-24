//Zaimplementuj interfejs Comparable, w taki sposób, aby głównym kryterium było nazwisko, drugim wiek.użyj metody sort.
// Lista przed powinna się różnic od listy po.
import org.trzcinska.Student;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Student one = new Student();
        one.setAge(20);
        one.setHeight(179);
        one.setName("John");
        one.setLastName("Smith");
        Student two = new Student();
        two.setAge(21);
        two.setHeight(179);
        two.setName("Alicia");
        two.setLastName("Green");
        Student three = new Student();
        three.setAge(23);
        three.setHeight(182);
        three.setName("Ben");
        three.setLastName("White");
        Student four = new Student();
        four.setAge(26);
        four.setHeight(170);
        four.setName("Jim");
        four.setLastName("Black");
        Student five = new Student();
        five.setAge(20);
        five.setHeight(185);
        five.setName("Patricia");
        five.setLastName("Moore");
        ArrayList<Student> students = new ArrayList<>();
        students.add(one);
        students.add(two);
        students.add(three);
        students.add(four);
        students.add(five);
        Collections.sort(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getLastName());
        }
    }
}
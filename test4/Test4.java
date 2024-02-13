import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.trzcinska.Student;
import java.util.Arrays;


public class Test4 {
    private Student[] students = new Student[3];
    private Student[] studentsSorted = new Student[3];
    @Test
    public void test_assertArrayEquals() {
        //given
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

        students[0] = one;
        studentsSorted[0] = one;
        students[1] = three;
        studentsSorted[1] = three;
        students[2] = two;
        studentsSorted[2] = two;

        //when
        Arrays.sort(studentsSorted);

        //then
        Assertions.assertArrayEquals(studentsSorted, students);
    }

}

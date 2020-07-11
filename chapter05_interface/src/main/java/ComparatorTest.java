import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 数组排序
 * @date 2020/7/11 11:00
 */
public class ComparatorTest {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student().setFirstName("zhang").setLastName("zhao lin"),
                new Student().setFirstName("shi").setLastName("wa"),
                new Student().setFirstName("ma").setLastName(null)
        };

        Arrays.sort(students, Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName));

        Arrays.sort(students, Comparator.comparing(Student::getName, (x, y) -> x.length() - y.length()));

        Arrays.sort(students, Comparator.comparing(Student::getName, Comparator.comparing(String::length)));

        Arrays.sort(students, Comparator.comparingInt(x -> x.getName().length()));

        Arrays.sort(students, Comparator.comparing(Student::getLastName, Comparator.nullsFirst(String::compareTo)));

        Arrays.sort(students, Comparator.comparing(Student::getLastName, Comparator.nullsFirst(Comparator.naturalOrder())));

        System.out.println(Arrays.toString(students));


    }


}

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description TODO
 * @date 2020/8/3 10:13
 */
public class ArrayAlgTest {

    public static void main(String[] args) {
        // String middle = ArrayAlg.getMiddle("John", "Q", "Public");

        Comparable<?> middle = ArrayAlg.getMiddle(3.14, 1279, 0);

        Object o = middle;

        if (o instanceof Comparable<?>) {

        }

        Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];

        Object[] objects = ArrayAlg.array(table);

        objects[0] = new Pair<Employee>().setFirst(new Employee()).setSecond(new Employee());

        System.out.println(table[0]);

        // ! System.out.println(table[0].getFirst().indexOf(0));


    }

}
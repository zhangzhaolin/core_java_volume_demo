import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 数组比较器排序
 * @date 2020/7/10 21:15
 */
public class ArrayComparatorTest {

    public static void main(String[] args) {
        // Comparator<String> lengthComparator = (s1, s2) -> s1.length() - s2.length();
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        String[] friends = new String[]{"Peter", "Paul", "Mary"};
        Arrays.sort(friends, lengthComparator);

        System.out.println(Arrays.toString(friends));
    }

}
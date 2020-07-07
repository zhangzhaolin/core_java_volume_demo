import java.util.Arrays;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 数组对象拷贝
 * @date 2020/7/7 17:59
 */
public class ArraysCopyOf {
    public static void main(String[] args) {
        goodCopyOf(new Integer[]{1, 2, 3}, 10);
        goodCopyOf(new Integer[]{1, 2, 3}, 20);
    }

    private static <T> T[] goodCopyOf(T[] a, int newLength) {
        return Arrays.copyOf(a, newLength);
    }
}
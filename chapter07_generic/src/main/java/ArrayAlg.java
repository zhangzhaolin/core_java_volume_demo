/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 定义一个泛型方法
 * @date 2020/8/3 10:10
 */
public class ArrayAlg {

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends Comparable> T min(T... a) {
        if (a == null || a.length <= 0) {
            return null;
        }
        T smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) {
                smallest = a[i];
            }
        }
        return smallest;
    }

    public static <E> E[] array(E... array) {

        return array;
    }

}
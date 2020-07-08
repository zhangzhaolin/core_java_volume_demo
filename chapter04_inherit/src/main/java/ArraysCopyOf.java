import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 数组对象拷贝
 * @date 2020/7/7 17:59
 */
public class ArraysCopyOf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString((Integer[]) goodCopyOf(new Integer[]{1, 2, 3}, 10)));
        System.out.println(Arrays.toString((int[]) goodCopyOf(new int[]{1, 2, 3}, 8)));
    }

    private static Object goodCopyOf(Object a, int newLength) {
        Class<?> aClass = a.getClass();
        if (!aClass.isArray()) return null;
        Class<?> componentType = aClass.getComponentType();
        int length = Array.getLength(a);

        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
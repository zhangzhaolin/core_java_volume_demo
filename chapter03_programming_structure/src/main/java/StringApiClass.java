import java.util.stream.IntStream;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description TODO
 * @date 2020/6/18 14:26
 */
public class StringApiClass {
    public static void main(String[] args) {
        String str = "我的老朋友们，对我的批评尽情开展";
        System.out.println(String.format("str.length() = %d", str.length()));
        // 返回指定位置的代码单元
        System.out.println(String.format("str.charAt(1) = %c", str.charAt(1)));
        // 返回从指定位置开始的码点
        System.out.println(String.format("str.codePointAt(1) = %d", str.codePointAt(1)));
        IntStream strStream = str.codePoints();

        strStream.forEach(System.out::println);

        int length = str.indexOf("对我的", 2);
    }

    static int indexOf(char[] source, int sourceCount,
                       char[] target, int targetCount,
                       int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[0];
        int max = (sourceCount - targetCount);

        for (int i = fromIndex; i <= max; i++) {
            /* Look for first character. */
            if (source[i] != first) {
                if (++i <= max && source[i] != first) {
                    while (true) {
                        if (++i > max || source[i] == first) {
                            break;
                        }
                    }
                }
            }

            /* Found first character, now look at the rest of v2 */
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                int k = 1;
                while (j < end && source[j] == target[k]) {
                    j++;
                    k++;
                }
                if (j == end) {
                    /* Found whole string. */
                    return i;
                }
            }
        }
        return -1;
    }
}
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description TODO
 *
 * @author zhangzhaolin
 * @version 1.0
 * @date 2020/6/14 15:31
 */
public class Solution {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0;
        if (arr.length < k) {
            return result;
        }
        int needsum = k * threshold;
        int i = 0;
        do {
            if (Arrays.stream(arr, i, i + k).parallel().sum() >= needsum) {
                result++;
            }
            i++;
        } while (i <= arr.length - k);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }

}
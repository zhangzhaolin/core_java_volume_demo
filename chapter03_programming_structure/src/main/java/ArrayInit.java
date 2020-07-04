/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 数组初始化
 * @date 2020/6/23 11:04
 */
public class ArrayInit {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        // int[] errorArray = new int[4]{1,2,3,4};

        int[][] dimensionalArray = new int[4][5];
        int[][] dimensionalArray1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
        int[][] dimensionalArray2 = new int[4][];
        int[][] dimensionalArray3 = {{1, 2, 3}, {4, 5, 6, 7}};
        // int[][] errorDimensionalArray = new int[1][]{{1,2,3}};

        int[][][] array34 = new int[3][][];
        int[][][] array345 = new int[][][]{{{1}, {2}}, {{3}, {4}}};
    }
}
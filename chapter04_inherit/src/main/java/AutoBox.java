/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 自动装箱
 * @date 2020/7/5 10:59
 */
public class AutoBox {

    public static void main(String[] args) {

        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println(i1 == i2);

        i1 = 128;
        i2 = 128;

        System.out.println(i1 == i2);

        i1 = 1;
        i2 = 1;

        System.out.println(i1 == i2);

    }



}
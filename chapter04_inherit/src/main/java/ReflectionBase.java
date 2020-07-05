import java.util.Random;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 反射基本示例
 * @date 2020/7/5 17:33
 */
public class ReflectionBase {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("第一种方式：");
        Employee e = new Employee();
        System.out.printf("e.getClass(): %s \n", e.getClass().getName());
        Integer i = 4;
        System.out.printf("i.getClass(): %s \n", i.getClass().getName());

        System.out.println("第二种方式：");
        Class<?> randomClass = Class.forName("java.util.Random");
        System.out.printf("randomClass.getName() : %s \n", randomClass.getName());

        System.out.println("第三种方式：");
        // int i2 = 4;
        Class<? extends Integer> i2Class = int.class;
        System.out.printf("i2Class.getName(): %s \n", i2Class.getName());
        Class<? extends double[]> doubleArrayClass = double[].class;
        System.out.printf("doubleArrayClass.getName(): %s \n", doubleArrayClass.getName());

        // Class<? extends Double[]> doubleArrayClass1 = Double[].class;

    }

}
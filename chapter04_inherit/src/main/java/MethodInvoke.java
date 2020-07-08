import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 调用任意方法
 * @date 2020/7/8 15:58
 */
public class MethodInvoke {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        // sqrt.invoke()
        for (double i = 1d; i <= 10; i++) {
            double result = (double) sqrt.invoke(null, i);
            System.out.printf("%f %f  \n", i, result);
        }
    }

}
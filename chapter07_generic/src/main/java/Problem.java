/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 不能抛出也不能捕获泛型对象
 * @date 2020/8/5 8:38
 */
public class Problem extends Throwable {

    public static <T extends Throwable> void dowork() throws T{
        try {

        } catch (Exception e) {
            // throw T;
        }
    }

}
import lombok.Getter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 调用处理器
 * @date 2020/7/14 18:19
 */
@Getter
public class TraceHandler implements InvocationHandler {

    private final Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.print(target + "." + method.getName() + "( ");

        if (args != null && args.length > 0) {
            String argString = Arrays.stream(args).map(Object::toString).collect(Collectors.joining(","));
            System.out.print(argString);
        }

        System.out.print(" )");

        System.out.println();

        return method.invoke(target, args);
    }
}
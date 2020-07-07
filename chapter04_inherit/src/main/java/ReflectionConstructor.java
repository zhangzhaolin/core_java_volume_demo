import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 反射调用构造器
 * @date 2020/7/5 17:55
 */
public class ReflectionConstructor {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "java.util.ArrayList";
        Class<?> sClass = Class.forName(s);

        printClass(sClass);
    }

    private static void printClass(Class<?> cl) {
        Class<?> extendsClass = cl.getSuperclass();
        System.out.printf(" %s class %s extends %s",
                Modifier.toString(cl.getModifiers()),
                cl.getSimpleName(),
                extendsClass.getSimpleName());

        // 打印 interface
        printInterface(cl);

        System.out.println(" {");

        // 打印具体字段
        printDeclaredFields(cl);

        // 打印内部类
        printInnerClass(cl);

        // 打印具体方法
        printDeclaredMethods(cl);

        System.out.println("}");
    }

    private static void printDeclaredMethods(Class<?> cl) {
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.printf(" %s %s %s ",
                    Modifier.toString(method.getModifiers()),
                    method.getReturnType().getSimpleName(),
                    method.getName());
            Parameter[] methodParameters = method.getParameters();
            StringBuilder sb = new StringBuilder("( ");
            for (Parameter parameter : methodParameters) {
                sb.append(parameter.getType().getSimpleName()).append(" ").append(parameter.getName()).append(" ,");
            }
            sb = new StringBuilder(sb.substring(0, sb.length() - 1));
            sb.append(" ) ");
            System.out.println(sb);
        }
    }

    private static void printInnerClass(Class<?> cl) {
        Class<?>[] innerClass = cl.getDeclaredClasses();
        for (Class<?> inner : innerClass) {
            printClass(inner);
        }
    }

    private static void printInterface(Class<?> cl) {
        Class<?>[] interfaceClass = cl.getInterfaces();

        if (interfaceClass.length > 0) {
            System.out.print(" implements ");
            String interfaceString = Arrays.stream(interfaceClass).map(Class::getName).collect(Collectors.joining(","));
            System.out.print(interfaceString);
        }
    }

    private static void printDeclaredFields(Class<?> cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("     %s ", Modifier.toString(field.getModifiers()));

            System.out.println(field.getType().getSimpleName() + " " + field.getName() + ";");
        }

    }

}
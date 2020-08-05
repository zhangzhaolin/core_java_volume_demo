import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 定义一个泛型类
 * @date 2020/8/3 10:05
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Pair<T> {

    private T first;
    private T second;

    public static <U extends Comparable> U[] minmax(Supplier<U[]> supplier) {
        return supplier.get();
    }

    @Override
    public boolean equals(Object value) {
        return false;
    }

}
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 经理
 * @date 2020/7/5 10:38
 */
@Setter
@Getter
public class Manager extends Employee {

    private double bounds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(bounds, manager.bounds) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bounds);
    }
}
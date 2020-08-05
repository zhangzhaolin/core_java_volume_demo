import java.time.LocalDate;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 桥方法
 * @date 2020/8/3 11:02
 */
public class DateInterval extends Pair<LocalDate> {

    @Override
    public Pair<LocalDate> setSecond(LocalDate second) {
        return super.setSecond(second);
    }

    @Override
    public LocalDate getFirst() {
        return super.getFirst();
    }
}
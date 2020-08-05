import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 通配符类型
 * @date 2020/8/5 10:40
 */
public class PairTest {

    public static void printBuddies(Pair<? super Manager> p) {
        Manager first = (Manager) p.getFirst();
        Manager second = (Manager) p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void main(String[] args) {
        printBuddies(new Pair<>(new Employee(), new Employee()));
        printBuddies(new Pair<>(new Manager(), new Manager()));

        printBuddies(new Pair<>(new Object(), new Object()));


        List<? super Employee> employeeList = new ArrayList<>();
        employeeList.add(new Manager());

        // System.out.println(new ArrayList<Object>().getClass() == new ArrayList<? super Employee>().getClass());

    }

}
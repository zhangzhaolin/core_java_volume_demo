import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description TODO
 * @date 2020/7/9 19:53
 */
@Setter
@Getter
@Accessors(chain = true)
@ToString
public class Student implements Named, Person {

    private String firstName;

    private String lastName;

    @Override
    public String getName() {
        return firstName + " " + (lastName == null ? "" : lastName);

    }
}
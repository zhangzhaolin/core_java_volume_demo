import java.util.Date;
import java.util.Objects;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 雇员类
 * @date 2020/6/23 11:39
 */
public class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return (Date) hireDay.clone();
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }
}
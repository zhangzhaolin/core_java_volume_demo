import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description 定时器测试 - 接口回调
 * @date 2020/7/10 21:08
 */
public class TimerTest {

    public static void main(String[] args) {

        Timer timer = new Timer(1000, actionEvent -> {
            System.out.println("At the tone, the time is " + LocalDateTime.now());
            Toolkit.getDefaultToolkit().beep();
        });

        timer.start();

        JOptionPane.showMessageDialog(null, "退出程序吗？");
        System.exit(0);

    }

}
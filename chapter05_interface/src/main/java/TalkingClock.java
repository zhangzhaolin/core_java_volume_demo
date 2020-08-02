import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author zhangzhaolin
 * @version 1.0
 * @description TODO
 * @date 2020/7/11 16:30
 */
@Setter
@Getter
public class TalkingClock {

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public static void printThisClass() {
        // new TalkingClock(1, false);
    }

    public void start(final boolean beep) {
        // new TalkingClock(1, false);
        // class TimePrinter implements ActionListener {
        //
        //     private static final String SOMETHING = "something";
        //
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("当前时间为 : " + new Date());
        //         if (beep) {
        //             Toolkit.getDefaultToolkit().beep();
        //         }
        //     }
        //
        // }


        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        // TalkingClock.TimePrinter s = this.new TimePrinter();
        // String s = TimePrinter.SOMETHING;


        Timer timer = new Timer(interval, actionListener);
        timer.start();
    }

    @Getter
    @Setter
    public class TimePrinter implements ActionListener {

        private static final String SOMETHING = "something";

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("当前时间为 : " + new Date());
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }


    }


}
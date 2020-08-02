/**
 * @author zhangzhaolin
 * @version 1.0
 * @description TODO
 * @date 2020/7/11 16:35
 */
public class InnerClassTest {

    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, true);
        TalkingClock.TimePrinter timePrinter = talkingClock.new TimePrinter();
    }

}
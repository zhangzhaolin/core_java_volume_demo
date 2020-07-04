/**
 * Description TODO
 *
 * @author zhangzhaolin
 * @version 1.0
 * @date 2020/6/14 11:44
 */
public class UnicodeAndChar {

    public static void main(String[] args) {
        char character = ';';
        System.out.println(String.format("character : %s", character));
        System.out.println(String.format("Integer.toHexString(%s) : %s",
                character, Integer.toHexString(character)));
        // char[] character = new char[]{'汉'};
        // character = {'汉'};
    }

}
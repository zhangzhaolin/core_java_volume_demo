/**
 * Description TODO
 *
 * @author zhangzhaolin
 * @version 1.0
 * @date 2020/6/14 14:19
 */
public class StringClass {

    public static void main(String[] args) {

        String word = "Word";
        String word2 = "Word";

        System.out.println(String.format("word == 'Word' : %b", word == "Word"));
        System.out.println(String.format("word2 == 'Word' : %b", word2 == "Word"));
        System.out.println(String.format("word == word2 : %b", word == word2));

        String s1 = "Hello Word!";
        String s2 = "Word Hello!";

        String t1 = s1.substring(6, 10);
        String t2 = s2.substring(0, 4);

        System.out.println(String.format("t1 = %s", t1));
        System.out.println(String.format("t2 = %s", t2));
        System.out.println(String.format("t1 == t2 : %b", t1 == t2));

        System.out.println(String.format("t1 == 'Word' : %b", t1 == "Word"));
        System.out.println(String.format("t2 == 'Word' : %b", t2 == "Word"));

        System.out.println(String.format("t1 == word : %b", t1 == word));
        System.out.println(String.format("t2 == word : %b", t2 == word));
    }
}
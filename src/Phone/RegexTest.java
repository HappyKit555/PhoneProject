package Phone;

/**
 * @author HappyKit
 * @version 11.0
 * @date 2021/8/30 15:22
 */
public class RegexTest {
    public static void main(String[]args){
        //String regex = "[^ab]*";
        //String regex = "\\w*";
        //String content = "4sh";
        String regex = "[a-z]{1}\\w{3,7}";
        String content = "a456fg";
        System.out.println(content.matches(regex));
    }
}

package kyu8;


/**
 * https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
 *
 * 可以new StringBuilder(String str) 做参数, 然后直接反转. 返回.
 */
public class StringReverse {
    public static String solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(str);   //更简单的方法
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
//        sb.reverse()
        return sb.toString();
    }

}

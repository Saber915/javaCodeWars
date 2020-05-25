package kyu8;

/**
 * https://www.codewars.com/kata/56efc695740d30f963000557/train/java
 * 大小写互换
 */
public class AlterNatingCase {
    public static String toAlternativeString(String string) {
        // your code here!
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(AlterNatingCase.toAlternativeString("altERnaTIng cAsE"));
    }
}

package kyu8;

/**
 * https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
 */
public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        // Solution

        StringBuilder sb = new StringBuilder();
        int length = one.length();
        for (int i = 0; i < length; i++) {
            sb.append(one.charAt(i));
            sb.append(two.charAt(i));
            sb.append(three.charAt(i));
        }
        return sb.toString();
    }
}

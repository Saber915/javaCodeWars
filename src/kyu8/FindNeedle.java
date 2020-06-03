package kyu8;

/**
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java
 */
public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        int idx=0;
        for (int i = 0; i < haystack.length; i++) {
            Object o = haystack[i];

            if (o instanceof String && "needle".equals(o)){
                idx = i;
                break;
            }
        }
        return "found the needle at position " + idx;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf("abc"));
    }
}

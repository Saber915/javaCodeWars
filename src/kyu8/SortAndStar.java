package kyu8;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java
 */
public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String s1 = s[0];
        String[] split = s1.split("");
        return String.join("***", split);


    }

    public static void main(String[] args) {
        System.out.println(SortAndStar.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
    }
}

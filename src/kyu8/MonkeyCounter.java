package kyu8;

/**
 * https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java
 */
public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        return array;
    }
}

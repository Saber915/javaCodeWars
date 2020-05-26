package kyu8;

/**
 * https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
 */
public class SquareNSum {
    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int i : n) {
            sum += i*i;
        }
        return sum;
    }
}

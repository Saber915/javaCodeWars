package kyu8;

/**
 * DivisibleNb
 * https://www.codewars.com/kata/5545f109004975ea66000086/train/java
 */
public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        return n % x == 0 && n % y ==0;
    }
}

package kyu8;

/**
 * https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
 */
public class SumOfPositive {
    public static int sum(int[] arr){
        int sum = 0;
        for (int i: arr) {
            if (i > 0){
                sum += i;
            }
        }
        return sum;
    }
}

package kyu8;

/**
 * https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/java
 */
public class GrassHopper {
    public static void main(String[] args) {

    }
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        return sum;

        //可以用 n*(n+1)/2
    }

}

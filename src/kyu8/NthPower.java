package kyu8;

/**
 * https://www.codewars.com/kata/57d814e4950d8489720008db/train/java
 */
public class NthPower {
    public static void main(String[] args) {
//        System.out.println(NthPower.nthPower(new int[] {3,1,2}, 2));
//        System.out.println(NthPower.nthPower(new int[] {1,2}, 2));
        System.out.println(NthPower.nthPower(new int[] {3,1,2}, 2));
    }

    public static int nthPower(int[] array, int n) {
        System.out.println(array.length);
        System.out.println(n);
        if (n >= array.length){
            return -1;
        }
        return (int)Math.pow(array[n], n);
    }
}

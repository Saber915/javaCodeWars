package kyu8;

/**
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
 */
public class Sequence {
    public static int[] reverse(int n){
        //your code
        int[] array =  new int[n];
        for (int i = 0, j=n; i < n; i++) {
            array[i] = j--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] reverse = Sequence.reverse(5);
        for (int i : reverse) {
            System.out.println(i);
        }
    }
}

package kyu8;

/**
 * https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
 */
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        for (int j : arr2) {
            sum += j;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}

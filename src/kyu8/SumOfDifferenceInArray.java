package kyu8;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e/train/java
 */
public class SumOfDifferenceInArray {
    public static int sumOfDifferences(int[] arr) {
        //your code;
        int sum = 0;
        if (arr.length <=1){
            return 0;
        }else{
            Arrays.sort(arr);
            for (int i = 0; i < arr.length-1; i++) {
                sum += Math.abs(arr[i]-arr[i+1]);
            }
        }

        return sum;

    }
    //2. 排序之后用最后一个减去最前一个数就可以了.
    public static int sumOfDifferences2(int[] arr){
        if (arr.length <=1){
            return 0;
        }else{
            Arrays.sort(arr);
            return arr[arr.length-1] - arr[0];
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
        System.out.println(sumOfDifferences2(new int[]{1, 2, 10}));
    }
}

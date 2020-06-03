package kyu8;

import java.util.Arrays;

/**
 * ZywOo
 * https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java
 */
public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (n <= 0){
            return Arrays.copyOfRange(arr,0,0);
        }else if (n > arr.length){
            return arr;
        }else{
            return Arrays.copyOfRange(arr, 0, n);
        }

    }

    public static void main(String[] args) {
        int[] take = ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 5);
        for (int i: take){
            System.out.println(i);
        }
    }
}

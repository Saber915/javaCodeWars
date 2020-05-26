package kyu8;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java
 */
public class ConvertNumber2ReversedArrayOfDigits {

    public static int[] digitize(long n) {
        List<Integer> list = new ArrayList<>();
        while (n / 10 != 0){
            int num = (int)(n % 10);
            list.add(num);
            n /= 10;
        }
        list.add((int)n);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] digitize = ConvertNumber2ReversedArrayOfDigits.digitize(35231);
        for (int i : digitize) {
            System.out.println(i);
        }
    }

}

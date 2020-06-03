package kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
 */
public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list= new ArrayList<>();
        for (int i : numbers) {
            if (i % divider == 0){
                list.add(i);
            }
        }


        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

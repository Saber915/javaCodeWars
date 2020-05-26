package kyu8;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.codewars.com/kata/57eaeb9578748ff92a000009/train/java
 */
public class MixedSum {
    public static int sum(List<?> mixed) {
        int sum = 0;
        for (Object o : mixed) {
            //Object对象都有toString方法.
            sum += Integer.parseInt(o.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(MixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }
}

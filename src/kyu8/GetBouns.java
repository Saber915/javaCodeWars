package kyu8;

/**
 * https://www.codewars.com/kata/56f6ad906b88de513f000d96/train/java
 */
public class GetBouns {
    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!
        return bonus?"\u00A3"+salary*10:"\u00A3"+salary;
    }

    public static void main(String[] args) {
        System.out.println(GetBouns.bonusTime(10000, true));
    }
}

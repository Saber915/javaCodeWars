package kyu8;

/**
 * https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java
 */
public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        // tip tap
        if ("terrible".equalsIgnoreCase(rating)){
            return 0;
        }else if ("poor".equalsIgnoreCase(rating)){
            return (int)Math.ceil(amount * 0.05);
        }else if("good".equalsIgnoreCase(rating)){
            return (int)(Math.ceil(amount * 0.1));
        }else if("great".equalsIgnoreCase(rating)){
            return (int)(Math.ceil(amount * 0.15));
        }else if ("excelletn".equalsIgnoreCase(rating)){
            return (int)(Math.ceil(amount * 0.2));
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(TipCalculator.calculateTip(30d, "poor"));

    }
}

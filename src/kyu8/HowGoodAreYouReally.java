package kyu8;

/**
 * https://www.codewars.com/kata/5601409514fc93442500010b/train/java
 */
public class HowGoodAreYouReally {
    public static void main(String[] args) {
        System.out.println(HowGoodAreYouReally.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int sum = yourPoints;
        for (int i : classPoints) {
            sum += i;
        }
        return (sum / (classPoints.length+1)) < yourPoints;
    }
}

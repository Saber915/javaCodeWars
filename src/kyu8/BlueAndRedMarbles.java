package kyu8;

/**
 * https://www.codewars.com/kata/5862f663b4e9d6f12b00003b/train/java
 */
public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        // Place your code here
        return (blueStart-bluePulled)*1.0/((blueStart + redStart) - (bluePulled + redPulled));
    }

    public static void main(String[] args) {

    }
}

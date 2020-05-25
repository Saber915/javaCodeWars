package kyu8;

/**
 * https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
 */
public class AllStar {
    public static int strCount(String str, char letter) {
        //write code here
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (letter == str.charAt(i)){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

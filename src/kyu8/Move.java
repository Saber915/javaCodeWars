package kyu8;

/**
 *https://www.codewars.com/kata/563a631f7cbbc236cf0000c2/train/java
 */
public class Move {
    public static int move(int position, int roll) {
        // your code here
        return position + roll * 2;
    }

    public static void main(String[] args) {
        System.out.println(move(3, 6));
    }

}

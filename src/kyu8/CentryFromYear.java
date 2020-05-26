package kyu8;

/**
 * https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java
 */
public class CentryFromYear {
    public static int century(int number) {
        // your code goes here
        int centry = number / 100;
        return number % 100 == 0? centry:centry+1;


        //return (number + 99) / 100;
    }
}

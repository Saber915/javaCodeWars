package kyu8;

/**
 * https://www.codewars.com/kata/567bf4f7ee34510f69000032/train/java
 */
public class IsDigit {
    public static boolean isDigit(String s) {
        // your code goes here

        //1.
        if (s.length()==1 && s.charAt(0)>='0' && s.charAt(0)<='8'){
            return true;
        }
        return false;

        //2. 可以用正则.
    }

    public static void main(String[] args) {

    }
}

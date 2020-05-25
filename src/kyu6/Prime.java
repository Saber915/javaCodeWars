package kyu6;

/**
 * https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java
 */
public class Prime {
    public static boolean isPrime(int num) {
        if (num > 1){
            boolean flag = false;
            for (int i = 2; i < (int)Math.sqrt(num) + 1 ; i++) {
                if (num % i == 0){
                    flag = true;
                    break;
                }
            }
            return !flag;
        }
        return false; //TODO
    }

    public static void main(String[] args) {

    }
}

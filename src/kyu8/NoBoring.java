package kyu8;

/**
 * https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java
 */
public class NoBoring {
    public static int noBoringZeros(int n) {
        // your code

//        String str = String.valueOf(n);
//        String s = str.replaceAll("0+$", "");
//
//        try{
//
//            return Integer.parseInt(s);
//        }catch (NumberFormatException e){
//            return 0;
//        }

        while (n % 10 == 0){
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(NoBoring.noBoringZeros(1450));

    }
}

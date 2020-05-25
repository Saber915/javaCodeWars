package kyu8;

/**
 * https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
 */
public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
//        char[] chars= new char[3];
//        chars[1] = '.';
//        String[] names = name.split(" ");
//        chars[0] = names[0].charAt(0);
//        chars[2] = names[1].charAt(0);
//        return new String(chars).toUpperCase();


        // 第二种解法.
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(AbbreviateTwoWords.abbrevName("Sam Harris"));
    }
}

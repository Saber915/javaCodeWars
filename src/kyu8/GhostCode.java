package kyu8;

/**
 * GhostCode
 * https://www.codewars.com/kata/570184a95594a091150000a0/train/java
 */
public class GhostCode {
    public static String helloName(final String name){

        if(name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }

    public static void main(String[] args) {
        System.out.println(helloName("Saber"));
    }
}

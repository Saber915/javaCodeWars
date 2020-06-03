package kyu8;


/**
 * codewars.com/kata/57eae20f5500ad98e50002c5/train/java
 */
public class RemoveStringSpace {
    static String noSpace(final String x) {
        String[] strings = x.split(" +");
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }

        return sb.toString();
        //直接使用替换
        //x.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(RemoveStringSpace.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));

    }
}

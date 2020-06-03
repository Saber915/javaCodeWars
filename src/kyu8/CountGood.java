package kyu8;

/**
 * https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java
 * 计算数组中的good数量, 0-2 publish
 * >2   'I smell a series!
 * <=0 Fail
 */
public class CountGood {
    public static String well(String[] x) {
        // TODO
        int count = 0;
        for (String s : x) {
            if ("good".equalsIgnoreCase(s)){
                count ++;
            }
            if (count > 2){
                return "I smell a series!";
            }
        }

        if (count == 0){
            return "Fail!";
        }else{
            return "Publish!";
        }

    }

    public static void main(String[] args) {
        System.out.println(CountGood.well(new String[] {"bad", "bad", "bad"}));
        System.out.println(CountGood.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        System.out.println(CountGood.well(new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}

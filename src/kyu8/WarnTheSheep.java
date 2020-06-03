package kyu8;

/**
 * https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java
 */
public class WarnTheSheep {
    public static String warnTheSheep(String[] array) {
        //Your code)))
        int count = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            count++;
            if ("wolf".equals(array[i])){
                break;
            }
        }

        return count == 0? "Pls go away and stop eating my sheep":"Oi! Sheep number "+count+"! You are about to be eaten by a wolf!" ;
    }

    public static void main(String[] args) {
//        warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"
//
        String[] array = {"sheep", "sheep", "wolf"};
        String[] array2 = {"sheep", "sheep", "sheep", "wolf", "sheep"};
        String s =  warnTheSheep(array);
        String s1 = warnTheSheep(array2);
        System.out.println(s);
        System.out.println(s1);
    }
}

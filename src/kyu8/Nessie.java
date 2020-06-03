package kyu8;

/**
 * https://www.codewars.com/kata/55ccdf1512938ce3ac000056/train/java
 */
public class Nessie {
    public static boolean isLockNessMonster(String s){
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        boolean tree_fiddy = s.contains("tree fiddy") || s.contains("3.5");
        System.out.println(tree_fiddy);
        return tree_fiddy;
    }

    public static void main(String[] args) {
        System.out.println(isLockNessMonster("Your girlscout cookies are ready to ship. Your total comes to tree fiddy"));
    }
}

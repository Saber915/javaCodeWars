package kyu8;

/**
 * https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
 */
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null && arrayOfSheep){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}

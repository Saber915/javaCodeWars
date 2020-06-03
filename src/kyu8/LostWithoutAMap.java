package kyu8;

/**
 * https://www.codewars.com/kata/beginner-lost-without-a-map/train/java
 */
public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] map = LostWithoutAMap.map(new int[]{1, 2, 3});
        for (int i : map) {
            System.out.println(i);
        }
    }
}

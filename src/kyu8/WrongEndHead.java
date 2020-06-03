package kyu8;

/**
 *https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
 */
public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String head = arr[0];
        arr[0] = arr[2];
        arr[2] = head;
        return arr;
    }

    public static void main(String[] args) {

    }
}
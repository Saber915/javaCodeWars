package kyu8;

/**
 * https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
 */
public class AreaOfPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l*l:(l+w)*2;

    }
}

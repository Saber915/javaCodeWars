package kyu8;

/**
 * https://www.codewars.com/kata/565f5825379664a26b00007c/train/java
 */
public class SurfaceAndArea {
    public static int[] getSize(int w,int h,int d) {
        //To-Do
        int surface = 2*(w*h + h*d + d*w);
        int area = w*d*h;
        return new int[]{surface, area};
    }
}

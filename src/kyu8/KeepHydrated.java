package kyu8;

/**
 * https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
 */
public class KeepHydrated {
    public int Liters(double time)  {

        //Your code goes here! Hint: You should change that -1

        return (int)Math.floor(time * 0.5);

    }

    public static void main(String[] args) {
        KeepHydrated kh = new KeepHydrated();
        System.out.println(kh.Liters(14.64));
    }
}

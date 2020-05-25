package kyu8;

/**
 * https://www.codewars.com/kata/57cc975ed542d3148f00015b
 */
public class ContainCheck {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        for (Object o : a) {
            if (o.equals(x)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ContainCheck.check(new Object[] {66, 101}, 66));
        System.out.println(ContainCheck.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(ContainCheck.check(new Object[] {'t', 'e', 's', 't'}, 'e'));
        System.out.println(ContainCheck.check(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }
}

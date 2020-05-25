package kyu8;

/**
 * https://www.codewars.com/kata/5bb904724c47249b10000131
 */
public class TotalPoints {
    public static int points(String[] games) {
        //implement me
        int total = 0;
        for (String s: games) {
            String[] split = s.split(":");
            int first = Integer.parseInt(split[0]);
            int second = Integer.parseInt(split[1]);
            if (first > second){
                total += 3;
            }
            //等于可以不用判断. 加0等于没加.只需要判断 大于和小于就可以了.
            if (first == second){
                total += 0;
            }
            if (first < second){
                total -= 1;
            }

        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(TotalPoints.points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));

        System.out.println(TotalPoints.points(new String[]
                {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }
}

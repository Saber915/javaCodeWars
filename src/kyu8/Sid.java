package kyu8;

/**
 * https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java
 */
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)
        int petals = nb_petals % 6;

        String saying = "";
        switch (petals){
            case 0:
                saying = "not at all";
                break;
            case 1:
                saying = "I love you";
                break;
            case 2:
                saying = "a little";
                break;
            case 3:
                saying = "a lot";
                break;
            case 4:
                saying = "passionately";
                break;
            case 5:
                saying = "madly";
                break;
        }
        return saying;
    }

    public static void main(String[] args) {
        System.out.println(Sid.howMuchILoveYou(1));
    }
}

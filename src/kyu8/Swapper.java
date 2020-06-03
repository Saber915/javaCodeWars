package kyu8;

/**
 * https://www.codewars.com/kata/5388f0e00b24c5635e000fc6/train/java
 */

class Swapper{

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = this.arguments[0];
        this.arguments[0] = this.arguments[1];
        this.arguments[1] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,2};

        Swapper r= new Swapper(args);
        r.swapValues();
    }
}

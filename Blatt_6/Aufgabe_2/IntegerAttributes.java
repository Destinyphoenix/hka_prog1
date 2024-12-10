package Blatt_6.Aufgabe_2;

class IntegerAttributes{
    public static void main(String[] args) {

        int [] numbers = {100, -100};

        // task a)
        System.out.println("Integer BYTES: " + Integer.BYTES);
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer SIZE: " + Integer.SIZE);
        System.out.println("Integer TYPE: " + Integer.TYPE);

        //task b)
        for (int number : numbers) {
            System.out.println("Integer " + Integer.valueOf(number) + " after bitCount is: " + Integer.bitCount(number));
            System.out.println("Integer " + Integer.valueOf(number) + " after rotateLeft of is: " + Integer.rotateLeft(number, 3));
            System.out.println("Integer " + Integer.valueOf(number) + " after numberOfTrailingZeros is: " + Integer.numberOfTrailingZeros(number));
            System.out.println("Integer " + Integer.valueOf(number) + " after reverse is: " + Integer.reverse(number));
        }
    }
}
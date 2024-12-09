package Aufgabe_1;

class ComplexTest {

    public static void main(String[] args) {

        Complex complexAdd = new Complex(-6,-8);
        Complex complexAdd2 = new Complex(3,-4);
        System.out.println(complexAdd.add(complexAdd2));

        Complex complexSubtract = new Complex(5,-3);
        Complex complexSubtract2 = new Complex(-8, 3);
        System.out.println(complexSubtract.sub(complexSubtract2));

        Complex complexMultiply = new Complex(10,10);
        Complex complexMultiply2 = new Complex(4,-5);
        System.out.println(complexMultiply.mul(complexMultiply2));

	Complex complexDevide = new Complex(3, -4);
	Complex complexDevide2 = new Complex(-6, -8);
	System.out.println(complexDevide.div(complexDevide2));


	
    }

}
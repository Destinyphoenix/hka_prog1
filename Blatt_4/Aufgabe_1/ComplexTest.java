package Blatt_4.Aufgabe_1;

class ComplexTest{
    public static void main(String[] args) {

        //create complex numbers to add
        Complex complexAdd = new Complex(3,4);
        Complex complexAdd2 = new Complex(1,-2);
        Complex expectedValueAdd = new Complex(4,2);

        //create complex numbers to subtract
        Complex complexSub = new Complex(5,6);
        Complex complexSub2 = new Complex(2,3);
        Complex expectedValueSub = new Complex(3,3);

        //create numbers to multiplicative
        Complex complexMul = new Complex(2,3);
        Complex complexMul2 = new Complex(4,-1);
        Complex expectedValueMul = new Complex(11,10);

        //create numbers to divide
        Complex complexDiv = new Complex(6,8);
        Complex complexDiv2 = new Complex(3,4);
        Complex expectedValueDiv = new Complex(2,0);

        //create numbers to show i2 equals -1
        Complex complexMuli2 = new Complex(0,1);
        Complex expectedValueMuli2 = new Complex(-1,0);

        //calculate addition
        Complex sum = complexAdd.add(complexAdd2);

        if (sum.equals(expectedValueAdd)) {
            System.out.println("Addition of " + complexAdd +  " and " + complexAdd2 + " is: " + sum + ". Ok");
        }
        else if (!sum.equals(expectedValueAdd)) {
            System.out.println("Addition of " + complexAdd +  " and " + complexAdd2 + " is: FAILED: expected " + expectedValueAdd + ", got " + sum);
        }


        //calculate subtraction
        Complex sub = complexSub.sub(complexSub2);

        //check equality with expected value
        if (sub.equals(expectedValueSub)) {
            System.out.println("Subtraction of " + complexSub +  " and " + complexSub2 + " is: " + sub + ". Ok");
        }
        else if (!sub.equals(expectedValueSub)) {
            System.out.println("Subtraction of " + complexSub +  " and " + complexSub2 + " is: FAILED: expected " + expectedValueSub + ", got " + sub);
        }


        //calculate multiplication
        Complex mul = complexMul.mul(complexMul2);

        //check equality with expected value
        if (mul.equals(expectedValueMul)) {
            System.out.println("Multiplication of " + complexMul +  " and " + complexMul2 + " is: " + mul + ". Ok");
        }
        else if (!mul.equals(expectedValueMul)) {
            System.out.println("Multiplication of " + complexMul +  " and " + complexMul2 + " is: FAILED: expected " + expectedValueMul + ", got " + mul);
        }


        //calculate division
        Complex div = complexDiv.div(complexDiv2);

        //check equality with expected value
        if (div.equals(expectedValueDiv)) {
            System.out.println("Division of " + complexDiv +  " and " + complexDiv2 + " is: " + div + ". Ok");
        }
        else if (!div.equals(expectedValueDiv)) {
            System.out.println("Division of " + complexDiv +  " and " + complexDiv2 + " is: FAILED: expected " + expectedValueDiv + ", got " + div);
        }


        //calculate i2 equals -1
        Complex muli2 = complexMuli2.mul(complexMuli2);

        //check equality with expected value
        if (muli2.equals(expectedValueMuli2)) {
            System.out.println("Multiplication of i2 is:" + muli2 + ". Ok");
        }
        else if (!muli2.equals(expectedValueMuli2)) {
            System.out.println("Multiplication of i2 is: FAILED: expected " + expectedValueMuli2 + ", got " + muli2);
        }

    }
}
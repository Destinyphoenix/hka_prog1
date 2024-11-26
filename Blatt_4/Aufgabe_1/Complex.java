package Blatt_4.Aufgabe_1;

class Complex {

    //create variables
    private double real;
    private double imag;

    //constructor for values
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //constructor with no values
    Complex() {
        this.real = 0.0;
        this.imag = 0.0;
       // this(0.0,0.0);
    }

    //methode for addition
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    //methode for subtraction
    public Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    //methode for multiplication
    public Complex mul(Complex other) {
        return new Complex(((this.real * other.real) - (this.imag * other.imag)), ((this.real * other.imag) + (this.imag * other.real)));
    }

    //methode for division
    public Complex div(Complex other) {
        return new Complex(((this.real * other.real) + (this.imag * other.imag)) / (Math.pow(other.real,2) + Math.pow(other.imag,2)), ((this.imag * other.real) - (this.real * other.imag)) / (Math.pow(other.real,2) + Math.pow(other.imag,2)));
    }

    //methode for equality
    public boolean equals(Complex other) {
        return Math.abs(this.real - other.real) < 1e-12 && Math.abs(this.imag - other.imag) < 1e-12;
    }

    //crate "complex-number" string
    @Override
    public String toString() {
        if (this.imag == 0.0) {
            return String.format("(%.0f)", this.real);
        }
        if (this.imag > 0.0) {
            return String.format("(%.0f + %.0fi)", this.real, this.imag);
        }
        if (this.imag < 0.0) {
            return String.format("(%.0f - %.0fi)", this.real, (-this.imag));
        }
        return "";
    }
}
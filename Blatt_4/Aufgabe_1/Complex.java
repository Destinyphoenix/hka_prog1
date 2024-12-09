package Aufgabe_1;

class Complex {

    double real;
    double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }
    Complex mul(Complex other) {
        return new Complex(((this.real * other.real) - (this.imag * other.imag)), ((this.real * other.imag) + (this.imag * other.real)));
    }
    Complex div(Complex other) {
        return new Complex(((this.real * other.real) + (this.imag * other.imag)) / ((other.real * other.real) + (other.imag * other.imag)),((this.imag * other.real) + (this.real * other.imag)) / ((other.real * other.real) + (other.imag * other.imag)));
    }

    public String toString() {
        if (this.imag == 0.0){
            return this.real + " ";
        }
        if (this.real == 0.0){
            return this.imag + "i";
        }
        if (this.imag < 0.0) {
            return this.real + " - " + (-this.imag) + "i";
        }
        if (this.imag > 0.0) {
            return this.real + " + " + this.imag + "i";
        }
        return "";
    }

    public boolean equals(Complex other) {
        if (Math.abs(this.real) - Math.abs(other.real) == 0 && Math.abs(this.imag) - Math.abs(other.imag) == 0) {
            return true;
        }
        else return false;
    }
}
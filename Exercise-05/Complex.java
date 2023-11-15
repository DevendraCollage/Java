// todo: Define class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. Also define addition method to add two complex objects.
class ComplexNumber {
    // This is Property of the Class
    private double real;
    private double imaginary;

    // Default Constructor
    ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized Constructor (Overload Constructor)
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition Method to add two complex numbers
    public ComplexNumber add(ComplexNumber comadd) {
        double newReal = this.real + comadd.real;
        double newImaginary = this.imaginary + comadd.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

public class Complex {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(2.0, 3.5);
        ComplexNumber cn2 = new ComplexNumber(2.5, 5.4);
        ComplexNumber sum = cn1.add(cn2);
        System.out.println("Complex1: " + cn1);
        System.out.println("Complex2: " + cn2);
        System.out.println("Sum: " + sum);
    }
}
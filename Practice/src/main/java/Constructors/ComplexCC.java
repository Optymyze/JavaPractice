package Constructors;

public class ComplexCC {

    private double re, im;

    public ComplexCC(double re, double im) {
        this.re = re;
        this.im = im;
    }

    ComplexCC(ComplexCC c) {
        System.out.println("Copy practice.Constructor called.");
        re = c.re;
        im = c.im;
    }

    @Override
    public String toString() {
        return "(" + re + " + "+ im + "i)";
    }
}

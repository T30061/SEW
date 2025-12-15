package dev.teddy.com.homework._11.wk1;

public class Dreieck extends Form {
    private double a,b,c;

    public Dreieck(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Dreieck { a=" + a + ", b=" + b + ", c=" + c + ", " + super.toString() + " }";
    }
}


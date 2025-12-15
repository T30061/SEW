package dev.teddy.com.homework._11.wk1;

public class Ellipse extends Form {
    protected double a;
    protected double b;

    public Ellipse(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Ellipse { a=" + a + ", b=" + b + ", " + super.toString() + " }";
    }
}


package dev.teddy.com.homework._11.wk1;

public class Kreis extends Ellipse {

    public Kreis(double x, double y, double radius) {
        super(x, y, radius, radius);
    }

    @Override
    public String toString() {
        return "Kreis { radius=" + a + ", " + super.toString() + " }";
    }
}


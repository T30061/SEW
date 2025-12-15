package dev.teddy.com.homework._11.wk1;

import java.util.List;

public class Parallelogramm extends Polygon {
    protected double a;
    protected double b;
    protected double angle;

    public Parallelogramm(double x, double y, List<Point> points,
                          double a, double b, double angle) {
        super(x, y, points);
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Parallelogramm { a=" + a + ", b=" + b +
                ", angle=" + angle + ", " + super.toString() + " }";
    }
}


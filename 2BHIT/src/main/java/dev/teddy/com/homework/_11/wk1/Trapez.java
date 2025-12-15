package dev.teddy.com.homework._11.wk1;

import java.util.List;

public class Trapez extends Polygon {
    private double a;
    private double b;
    private double h;

    public Trapez(double x, double y, List<Point> points,
                  double a, double b, double h) {
        super(x, y, points);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Trapez { a=" + a + ", b=" + b +
                ", h=" + h + ", " + super.toString() + " }";
    }
}

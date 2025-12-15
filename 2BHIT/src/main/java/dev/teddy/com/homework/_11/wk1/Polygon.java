package dev.teddy.com.homework._11.wk1;

import java.util.List;

public class Polygon extends Form {
    protected List<Point> points;

    public Polygon(double x, double y, List<Point> points) {
        super(x, y);
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon { points=" + points + ", " + super.toString() + " }";
    }
}


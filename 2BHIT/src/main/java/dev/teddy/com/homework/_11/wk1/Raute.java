package dev.teddy.com.homework._11.wk1;

import java.util.List;

public class Raute extends Parallelogramm {

    public Raute(double x, double y, List<Point> points,
                 double side, double angle) {
        super(x, y, points, side, side, angle);
    }

    @Override
    public String toString() {
        return "Raute { side=" + a + ", angle=" + angle + ", " + super.toString() + " }";
    }
}

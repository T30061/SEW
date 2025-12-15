package dev.teddy.com.homework._11.wk1.rechteck;

import dev.teddy.com.homework._11.wk1.Rechteck;

public class Quadrat extends Rechteck {
    public Quadrat(double x, double y, double side) {
        super(x, y, side, side);
    }

    @Override
    public String toString() {
        return "Quadrat { side=" + width + ", " + super.toString() + " }";
    }
}

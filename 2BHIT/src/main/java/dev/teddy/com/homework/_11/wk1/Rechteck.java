package dev.teddy.com.homework._11.wk1;

public class Rechteck extends Form{
    protected double width;
    protected double height;

    public Rechteck(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rechteck{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

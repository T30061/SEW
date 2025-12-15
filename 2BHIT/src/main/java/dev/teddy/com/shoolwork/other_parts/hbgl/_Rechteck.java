package dev.teddy.com.shoolwork.other_parts.hbgl;

public class _Rechteck extends _Shape{

    public _Rechteck(float a, float b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("Drawn");
    }

    @Override
    public float berechneumfang() {
        return 0;
    }

    @Override
    public float berechnerflaeche() {
        return 0;
    }
}

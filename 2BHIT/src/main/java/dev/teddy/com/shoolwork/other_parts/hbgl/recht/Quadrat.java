package dev.teddy.com.shoolwork.other_parts.hbgl.recht;


import dev.teddy.com.shoolwork.other_parts.hbgl._Rechteck;

public class Quadrat extends _Rechteck {
    public Quadrat(float a) {
        super(a = a, a = a);
    }

    @Override
    public float berechneumfang() {
        return a*4;
    }

    @Override
    public float berechnerflaeche() {
        return a*a;
    }
}

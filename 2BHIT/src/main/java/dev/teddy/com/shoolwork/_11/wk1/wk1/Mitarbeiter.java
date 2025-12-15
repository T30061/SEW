package dev.teddy.com.shoolwork._11.wk1.wk1;

public class Mitarbeiter {
    protected String name;
    protected double grundgehalt;
    protected int id;

    public Mitarbeiter(String name, double grundgehalt,int id) {
        this.name = name;
        this.grundgehalt = grundgehalt;
    }

    public double berechneGehalt() {
        return grundgehalt;
    }

    public void druckeInfo() {
        System.out.println(name + " verdient " + berechneGehalt() + " €");
    }

    public void druckeInfo(boolean mitTitel) {
        if (mitTitel) {
            System.out.println("--- Mitarbeiterinfo ---");
        }
        druckeInfo();
    }
}


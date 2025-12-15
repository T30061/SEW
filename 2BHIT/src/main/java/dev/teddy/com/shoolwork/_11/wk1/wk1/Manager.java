package dev.teddy.com.shoolwork._11.wk1.wk1;

public class Manager extends Mitarbeiter {
    private double bonus;

    public Manager(String name, double grundgehalt, double bonus) {
        super(name, grundgehalt);
        this.bonus = bonus;
    }

    @Override
    public double berechneGehalt() {
        return grundgehalt + bonus;
    }
}


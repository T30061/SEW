package dev.teddy.com.shoolwork._12.wk1;

import dev.teddy.com.shoolwork._11.wk1.wk1.Mitarbeiter;

public class Manager extends Mitarbeiter {
    private double bonus, Grundgehalt;
    public Manager(String name, double Grundgehalt, double bonus, int id) {
        super(name,Grundgehalt, id);
        this.Grundgehalt = Grundgehalt;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", grundgehalt=" + grundgehalt +
                ", id=" + id +
                '}';
    }
}

package dev.teddy.com.shoolwork._12.wk1;

public class Manager extends Stack_Employee{
    private double bonus, Grundgehalt;
    public Manager(String name, double Grundgehalt, double bonus, int id) {
        super(name, id);
        this.Grundgehalt = Grundgehalt;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

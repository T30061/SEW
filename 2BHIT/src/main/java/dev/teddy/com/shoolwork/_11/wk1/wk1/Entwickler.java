package dev.teddy.com.shoolwork._11.wk1.wk1;

public class Entwickler extends Mitarbeiter {
    private String programmiersprache;

    public Entwickler(String name, double grundgehalt, String programmiersprache) {
        super(name, grundgehalt);
        this.programmiersprache = programmiersprache;
    }

    @Override
    public double berechneGehalt() {
        if (programmiersprache.equalsIgnoreCase("Java")) {
            return grundgehalt * 1.10; // +10% Bonus
        } else {
            return grundgehalt;
        }
    }

    public void arbeite() {
        System.out.println(name + " schreibt Code in " + programmiersprache + ".");
    }
}


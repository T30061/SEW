package dev.teddy.com.shoolwork._11.wk1.wk1;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Manager m1 = new Manager("Anna", 5000, 1500,102);
        Entwickler e1 = new Entwickler("Ben", 4000, "Java", 100);
        Entwickler e2 = new Entwickler("Clara", 4000, "Python",101);

        System.out.println("=== Einzeltests ===");
        m1.druckeInfo();
        e1.druckeInfo(true);
        e1.arbeite();
        e2.arbeite();

        System.out.println("\n=== Polymorphie-Test ===");
        Mitarbeiter[] liste = {m1, e1, e2};

        for (Mitarbeiter m : liste) {
            m.druckeInfo(true);
        }
    }
}


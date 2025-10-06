package dev.teddy.com.homework._10.wk1;


import java.util.Scanner;

public class Main_inWorten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein: ");
        int number = sc.nextInt();
        System.out.println(zahlInWorten(number));
    }

    public static String zahlInWorten(int zahl) {
        if (zahl < 0 || zahl > 99) {
            throw new IllegalArgumentException("Nur Zahlen von 0 bis 99 erlaubt.");
        }
        String[] einheiten = {
            "null", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun",
            "zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"
        };
        String[] zehner = {
            "", "", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"
        };

        if (zahl < 20) {
            return zahl == 1 ? "eins" : einheiten[zahl];
        }
        int ein = zahl % 10;
        int zehn = zahl / 10;
        return (ein == 0 ? "" : einheiten[ein] + "und") + zehner[zehn];
    }
}

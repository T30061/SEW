package dev.teddy.com.shoolwork._09.wk3;

import java.util.Scanner;

public class ArraySucher {

    public static void searchInArray(){
        String[] datenstrucktur = {
                "Rafi mag füße",
                "Ben mag füße",
                "ALLE MÖGEN FÜße"
        };

        System.out.println("Geben sie den satz ein: ");
        String searched = new Scanner(System.in).nextLine();

        if(isInArrayString(datenstrucktur, searched))
            System.out.println("Ja ist im array");
        else
            System.out.println("Nein ist nicht im array");

    }


    public static boolean isInArrayFloat(Float[] array, float Gesucht){
        for (float Ergebnis : array) {
            if(Ergebnis == Gesucht)
                return true;
        }
        return false;
    }

    public static boolean isInArrayDouble(Double[] array, double Gesucht){
        for (Double Ergebnis : array) {
            if(Ergebnis == Gesucht)
                return true;
        }
        return false;
    }

    public static boolean isInArrayInt(int [] array, int Gesucht){
        for (int Ergebnis : array) {
            if(Ergebnis == Gesucht)
                return true;
        }
        return false;
    }

    public static boolean isInArrayString(String[] array, String Gesucht){
        for (String Ergebnis : array) {
            if(Ergebnis.equalsIgnoreCase(Gesucht))
                return true;
        }
        return false;
    }
}

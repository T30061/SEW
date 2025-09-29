package dev.teddy.com.shoolwork._09.wk4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sotieren {
    public static List<Integer> sort = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            System.out.printf("Bitte geben sie die %d. Zahl ein", i);
            sort.add(sc.nextInt());
        }

        sortAbsteigenSmart(sort.get(0), sort.get(1), sort.get(2));
        System.out.println(sort);
        sortAufsteigendSmart(sort.get(0), sort.get(1), sort.get(2));
        System.out.println(sort);
    }

    public static void sortAbsteigenSmart(int zahl1, int zahl2, int zahl3) {
        int first, second, third;

        if (zahl1 <= zahl2 && zahl1 <= zahl3) {
            first = zahl1;
            if (zahl2 <= zahl3) {
                second = zahl2;
                third = zahl3;
            } else {
                second = zahl3;
                third = zahl2;
            }
        } else if (zahl2 <= zahl1 && zahl2 <= zahl3) {
            first = zahl2;
            if (zahl1 <= zahl3) {
                second = zahl1;
                third = zahl3;
            } else {
                second = zahl3;
                third = zahl1;
            }
        } else {
            first = zahl3;
            if (zahl1 <= zahl2) {
                second = zahl1;
                third = zahl2;
            } else {
                second = zahl2;
                third = zahl1;
            }
        }
        sort.clear();
        sort.add(first);
        sort.add(second);
        sort.add(third);
    }

    public static void sortAufsteigendSmart(int zahl1, int zahl2, int zahl3) {
        int first, second, third;

        if (zahl1 >= zahl2 && zahl1 >= zahl3) {
            first = zahl1;
            if (zahl2 >= zahl3) {
                second = zahl2;
                third = zahl3;
            } else {
                second = zahl3;
                third = zahl2;
            }
        } else if (zahl2 >= zahl1 && zahl2 >= zahl3) {
            first = zahl2;
            if (zahl1 >= zahl3) {
                second = zahl1;
                third = zahl3;
            } else {
                second = zahl3;
                third = zahl1;
            }
        } else {
            first = zahl3;
            if (zahl1 >= zahl2) {
                second = zahl1;
                third = zahl2;
            } else {
                second = zahl2;
                third = zahl1;
            }
        }

        sort.clear();
        sort.add(first);
        sort.add(second);
        sort.add(third);
    }
}

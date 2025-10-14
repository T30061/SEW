package dev.teddy.com.homework._10.wk2;

import dev.teddy.com.homework._10.wk2.ex.InvalidPersonException;
import dev.teddy.com.homework._10.wk2.ex.PersonDublicated;
import dev.teddy.com.homework._10.wk2.ex.PersonListFullException;
import dev.teddy.com.homework._10.wk2.ex.PersonNotFoundException;
import org.junit.platform.commons.JUnitException;

public class Main_reSucher {
    public static boolean found;
    public static PersonList list;
    public static void main(String[] args) {
        list = new PersonList(2);

        try {
            list.addPerson(new Person("", 20));
            System.out.println("Hinzufügen (ungültig): true");
        } catch (InvalidPersonException | PersonListFullException | PersonDublicated e) {
            System.err.println("Hinzufügen (ungültig): false (" + e.getMessage() + ")");
        }

        try {
            list.addPerson(new Person("Anna", -1));
            System.out.println("Hinzufügen (negatives Alter): true");
        } catch (InvalidPersonException | PersonListFullException | PersonDublicated e) {
            System.err.println("Hinzufügen (negatives Alter): false (" + e.getMessage() + ")");
        }

        try {
            list.addPerson(new Person("Ben", 22));
            System.out.println("Hinzufügen (Ben): true");
        } catch (InvalidPersonException | PersonListFullException | PersonDublicated e) {
            System.err.println("Hinzufügen (Ben): false (" + e.getMessage() + ")");
        }

        try {
            list.addPerson(new Person("Rafi", 21));
            System.out.println("Hinzufügen (Rafi): true");
        } catch (InvalidPersonException | PersonListFullException | PersonDublicated e) {
            System.err.println("Hinzufügen (Rafi): false (" + e.getMessage() + ")");
        }

        try {
            list.addPerson(new Person("Max", 30));
            System.out.println("Hinzufügen (Liste voll): true");
        } catch (InvalidPersonException | PersonListFullException | PersonDublicated e) {
            System.err.println("Hinzufügen (Liste voll): false (" + e.getMessage() + ")");
        }

        try {
            found = list.containsPerson("Ben");
            System.out.println("Suche (Ben): " + found);
        } catch (PersonNotFoundException e) {
            System.err.println("Suche (Ben): false (" + e.getMessage() + ")");
        }

        try {
            found = list.containsPerson("Max");
            System.out.println("Suche (Max): " + found);
        } catch (PersonNotFoundException e) {
            System.err.println("Suche (Max): false (" + e.getMessage() + ")");
        }
    }
}
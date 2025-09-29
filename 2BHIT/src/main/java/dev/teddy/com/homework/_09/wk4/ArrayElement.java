package dev.teddy.com.homework._09.wk4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElement {
    public static ArrayList<String> names = new ArrayList<>();
    public static String[] names_of = {"Rafi", "Lukas", "Magomed"};

    public static void main(String[] args) {
        names.addAll(Arrays.asList(names_of));
        insertElm("Paul");
        deleteElm("Lukas");
        containsElm("Rafi");
    }


    public static void insertElm(String name){
        names.add(name);
        System.out.println("added");
    }

    public static void deleteElm(String name){
        names.remove(name);
        System.out.println("del");
    }

    public static void containsElm(String name){
        names.contains(name);
        System.out.println("true");
    }

}

package dev.teddy.com.shoolwork._10.wk4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManager {
    protected List<String> liste = new ArrayList<>();

    public void insElem(String element) {
        liste.add(element);
    }

    public void insElem(String[] elemente) {
        liste.addAll(Arrays.asList(elemente));
    }

    public void printList() {
        System.out.println(liste);
    }
}


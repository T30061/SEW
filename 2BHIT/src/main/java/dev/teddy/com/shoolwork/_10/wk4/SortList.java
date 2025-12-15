package dev.teddy.com.shoolwork._10.wk4;

import java.util.Collections;

public class SortList extends ListManager {

    @Override
    public void insElem(String element) {
        super.insElem(element);
        Collections.sort(liste);
    }
}

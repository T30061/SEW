package dev.teddy.com.shoolwork._10.wk4;

public class UniqueList extends ListManager {

    @Override
    public void insElem(String element) {
        if (!liste.contains(element)) {
            liste.add(element);
        } else {
            System.out.println("Element \"" + element + "\" bereits vorhanden – wird nicht hinzugefügt.");
        }
    }
}

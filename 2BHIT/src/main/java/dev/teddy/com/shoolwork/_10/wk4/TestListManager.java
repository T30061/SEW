package dev.teddy.com.shoolwork._10.wk4;

public class TestListManager {
    public static void main(String[] args) {
        System.out.println("=== ListManager ===");
        ListManager listManager = new ListManager();
        listManager.insElem("Apfel");
        listManager.insElem(new String[]{"Banane", "Kirsche", "Apfel"});
        listManager.printList();

        System.out.println("\n=== SortList ===");
        SortList sortList = new SortList();
        sortList.insElem("Banane");
        sortList.insElem("Apfel");
        sortList.insElem("Kirsche");
        sortList.printList();

        System.out.println("\n=== UniqueList ===");
        UniqueList uniqueList = new UniqueList();
        uniqueList.insElem("Apfel");
        uniqueList.insElem("Apfel"); // Duplikat
        uniqueList.insElem(new String[]{"Banane", "Apfel", "Kirsche"});
        uniqueList.printList();
    }
}


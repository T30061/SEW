package htl.teddy_com.code._04.homework._2_4;

import java.util.ArrayList;

public class _Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("T30061"));
        computers.add(new Computer("T30062"));
        computers.add(new Computer("T30063"));
        for(Computer el : computers){
            System.out.println(el.toString());
        }
    }
}
